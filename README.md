# Demonstrate jpackage for Scala apps for OS X and Windows using GitHub workflows

This repo demonstrates the integration of Scala and Java 14's jpackage using GitHub workflows to create installable apps for both Windows and OS X.

## Usage

Commits to any branch named `release/*` should result in triggering the workflow actions that:
* build a fat jar using sbt-assembly
* build an OS X dmg file
* build a Windows msi file
The built artifacts (jars, msis, dmgs) can be found under the repo's Action tab.

The dmg should be installable on OS X, adding an app named `SwingTest`.

The msi should be installable on Windows, adding an app named `SwingTest`.

## Limitations

These apps are not signed, so both OS X and Windows installs will result in security warnings.

For some reason, the dmg file is not created with the usual Applications symlink and arrow icons.

## Tooling

* [Scala](https://www.scala-lang.org)
* [sbt-assembly](https://github.com/sbt/sbt-assembly)
* [Java 14](https://openjdk.java.net/projects/jdk/14/)
* [GitHub Workflows](https://help.github.com/en/actions/configuring-and-managing-workflows/configuring-a-workflow)

## Author

**Phillip Lenhardt** - [philen](https://github.com/philen)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
