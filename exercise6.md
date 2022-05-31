# exercise 6

- How to generate Maven Site Documentation\
A: maven offers a standard solution with "maven-project-info-reports-plugin".\
for the most basic tasks, the standard configuration will be sufficient.\
if there is a need for more specific reporting, then a single line report set can add or change the report logs.
the reportsets are listed with all other maven plugins on this [https://maven.apache.org/plugins/index.html](site). Look for "Reporting plugins"

- Welche unterschiedlichen Aspekte, Konfigurationen, Informationen, usw.
  werden in site.xml bzw. pom.xml konfiguriert?\
A: 
- in the pom some plugins need to be added: maven-project-info-reports-plugin, maven-site-plugin, maven-javadoc-plugin, jacoco-maven-plugin\
the jacoco-maven-plugin handles the report.
- in the site.xml the reports are formatted

- Verlinken Sie Ihre neue Markdown Datei auch in Ihrer README.md\
A: [src/site/markdown/markup.md](markup.md)

[link zum eigentlichen README](README.md)
