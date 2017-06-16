--
-- manually update organisms
--

UPDATE organism SET
genus='Cicer', species='arietinum', shortname='C. arietinum (kabuli)', name='Cicer arietinum (kabuli)', commonname='chickpea (kabuli)'
WHERE variety='CDCFrontier';

UPDATE organism SET 
genus='Cicer', species='arietinum', shortname='C. arietinum (desi)', name='Cicer arietinum (desi)', commonname='chickpea (desi)'
WHERE variety='ICC4958';

UPDATE organism SET genus='Magnoliophyta', name='Magnoliophyta', commonname='flowering plants' WHERE taxonid=3398;
UPDATE organism SET genus='Phaseolus', species='vulgaris', name='Phaseolus vulgaris', commonname='string bean', shortname='P. vulgaris' WHERE taxonid=3885;
UPDATE organism SET genus='Glycine', species='max', name='Glycine max', commonname='soybean', shortname='G. max' WHERE taxonid=3847;
UPDATE organism SET genus='Arachis', species='duranensis', name='Arachis duranensis', commonname='peanut', shortname='A. duranensis' WHERE taxonid=130453;
UPDATE organism SET genus='Arachis', species='ipaensis', name='Arachis ipaensis', commonname='peanut', shortname='A. ipaensis' WHERE taxonid=130454;
UPDATE organism SET genus='Medicago', species='truncatula', name='Medicago truncatula', commonname='barrel medic', shortname='M. truncatula', variety='A17' WHERE taxonid=3880;
UPDATE organism SET genus='Arabidopsis', species='thaliana', name='Arabidopsis thaliana', commonname='thale cress', shortname='A. thaliana' WHERE taxonid=3702;
