--
-- swap gene identifiers and drop phavu. from primaryIdentifiers
--

UPDATE gene SET primaryidentifier=secondaryidentifier,secondaryidentifier=primaryidentifier WHERE secondaryidentifier LIKE 'phavu.%';

UPDATE gene SET primaryidentifier=substring(primaryidentifier,7) WHERE primaryidentifier LIKE 'phavu.%';
