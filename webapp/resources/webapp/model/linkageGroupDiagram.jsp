
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page import="java.net.URLEncoder" language="java" %>

<!-- linkageGroupDiagram.jsp -->
<html:xhtml />

<tiles:importAttribute />

<c:set var="MAX_CLUSTER" value="100" />
<c:set var="MAX_MAP" value="600" />
<c:set var="MAX_DEFAULT_OPEN" value="100" />

<link rel="stylesheet" href="model/canvasXpress.css" type="text/css"/>
<script type="text/javascript" src="model/canvasXpress.min.js"></script>
<!--[if IE]><script type="text/javascript" src="model/canvasXpress/js/excanvas.js"></script><![endif]-->

<canvas id="canvasID" width="1200" height="600"></canvas>
<script type="text/javascript">
var cx = new CanvasXpress("canvasID",
                          ${tracksJSON}, 
                          {
                              "graphType": "Genome",
                              "backgroundType": "solid",
                              "showShadow": false,
                              "featureStaggered": true,
                              "background": ${WEB_PROPERTIES['linkageGroupDiagram.background']},
                              "fontName": ${WEB_PROPERTIES['linkageGroupDiagram.fontName']},
                              "featureNameFontSize": ${WEB_PROPERTIES['linkageGroupDiagram.featureNameFontSize']},
                              "featureNameFontColor": ${WEB_PROPERTIES['linkageGroupDiagram.featureNameFontColor']},
                              "featureNameFontStyle": ${WEB_PROPERTIES['linkageGroupDiagram.featureNameFontStyle']},
                              "featureHeightDefault": ${WEB_PROPERTIES['linkageGroupDiagram.featureHeightDefault']},
                              "xAxisTickColor": ${WEB_PROPERTIES['linkageGroupDiagram.xAxisTickColor']},
                              "wireColor": ${WEB_PROPERTIES['linkageGroupDiagram.wireColor']},
                              "setMinX": 0,
                              "setMaxX": ${maxLGLength}+5,
                              "xAxisExact": false
                          },
                          {
                              'click': function(o) {
                                  var featureId = o[0].data[0].id;
                                  var featureType = o[0].type;
                                  var featureColor = o[0].data[0].fill;
                                  if (featureType=="triangle") {
                                      var query = '<query name="" model="genomic" view="GeneticMarker.primaryIdentifier"><constraint path="GeneticMarker.primaryIdentifier" op="=" value="'+featureId+'"/></query>';
                                      var encodedQuery = encodeURIComponent(query);
                                      encodedQuery = encodedQuery.replace("%20", "+");
                                      window.open("loadQuery.do?skipBuilder=true&query="+encodedQuery+"%0A++++++++++++&trail=|query&method=xml");
                                  } else if (featureType=="box" && featureColor=="yellow") {
                                      var query = '<query name="" model="genomic" view="QTL.primaryIdentifier QTL.organism.name"><constraint path="QTL.primaryIdentifier" op="=" value="'+featureId+'"/></query>';
                                      var encodedQuery = encodeURIComponent(query);
                                      encodedQuery = encodedQuery.replace("%20", "+");
                                      window.open("loadQuery.do?skipBuilder=true&query="+encodedQuery+"%0A++++++++++++&trail=|query&method=xml");
                                  }
                              }
                          }
     
 );
</script>
<!-- /linkageGroupDiagram.jsp -->
