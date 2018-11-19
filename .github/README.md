<a href="https://codebeat.co/projects/github-com-albbw-database-interface-master"><img alt="codebeat badge" src="https://codebeat.co/badges/7149e145-0c9c-4c21-9e21-6db20f26c390" /></a>&nbsp;&nbsp;&nbsp;&nbsp;<a class="badge-align" href="https://www.codacy.com/app/ALBBW/database-interface?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=ALBBW/database-interface&amp;utm_campaign=Badge_Grade"><img src="https://api.codacy.com/project/badge/Grade/84606e5e098c47a9ac8161de5790d194"/></a><br>&nbsp;&nbsp;&nbsp;&nbsp;

# database-interface

This is a database interface based on Java and run as Daemon with <a href="http://yajsw.sourceforge.net/">YAJSW</a>. It uses Telnet for receiving commands and after converting them in the proper format, they will be send to the database software.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

The database interface needs Java (JDK 10.0.2 recommended) and YAJSQ (For running as Daemon).

<a href="https://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html#javasejdk">Java JDK 10.0.2</a><br>
<a href="http://yajsw.sourceforge.net/">YAJSW</a>

### Installing (Windows 10)

First you need to install Java.

After installing Java download the YAJSW and unpack it.

Now clone the repository.

You should run the *.jar in the cloned directory.

After that open the cmd and type:

```
cd C:\...\yajsw-stable-xx.xxx\bat
```
open the taskmanager and find you PID of the java.exe (You should only run one java program, so that you easily find the right pid.) and enter:

```
genconfig.bat - <PID>
```
now go to ../conf and edit the following in the wrapper.conf
```
change wrapper.ntservice.name=yajsw to wrapper.ntservice.name=database-interface
change wrapper.ntservice.displayname=yajsw to wrapper.ntservice.displayname=Database Interface
change wrapper.ntservice.description=yajsw to wrapper.ntservice.description=This is the Database Interface Service.
```
save and then run the runConsole.bat.
Now you can install is as Daemon when you run the installService.bat

## Contributing

Please read [CONTRIBUTING.md](https://github.com/ALBBW/database-interface/blob/master/.github/CONTRIBUTING.md) and our [CODE_OF_CONDUCT.md](https://github.com/ALBBW/database-interface/blob/master/.github/CODE_OF_CONDUCT.md) for the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/ALBBW/database-interface/tags). 

## Authors

* **Joscha Alhelm** - *Initial work* - [GamesGamble](https://github.com/GamesGamble)

See also the list of [contributors](https://github.com/ALBBW/database-interface/contributors) who participated in this project.

## License

This project is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International Public License - see the [LICENSE.md](https://github.com/ALBBW/database-interface/blob/master/LICENSE.md) file for details
