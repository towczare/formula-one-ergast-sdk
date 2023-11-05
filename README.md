# Formula One Ergast 

Java implementation to get a historical record of motor racing data from [Ergast Developer API](http://ergast.com/mrd/).

## Add dependencies

### Maven

Add the dependency:

```xml
<dependency>
    <groupId>pl.kodujmy.formula.ergast</groupId>
    <artifactId>formula-one-ergast-sdk</artifactId>
    <version>0.1.1</version>
</dependency>
```


## Usage

You have to initialize Ergast object:

```java
Ergast ergast = new Ergast(2016, 100, 2);
```
```java
Ergast ergast = new Ergast();
```

If you use default constructor, season will be set as NO_SEASON, limit as DEFAULT_LIMIT and offset as DEFAULT_OFFSET.

You can get the following objects that satisfy Ergast queries:
* [Season](http://ergast.com/mrd/methods/seasons/)
* [Qualification](http://ergast.com/mrd/methods/qualifying/)
* [Constructor](http://ergast.com/mrd/methods/constructors/)
* [LapTimes](http://ergast.com/mrd/methods/laps/)
* [Schedule](http://ergast.com/mrd/methods/schedule/)
* [DriverStandings, ConstructorStandings](http://ergast.com/mrd/methods/standings/)
* [Circuit](http://ergast.com/mrd/methods/circuits/)
* [RacePitStops](http://ergast.com/mrd/methods/pitstops/)
* [RaceResult](http://ergast.com/mrd/methods/results/)
* [Driver](http://ergast.com/mrd/methods/drivers/)
* [FinishingStatus](http://ergast.com/mrd/methods/status/)

For example, to get information about pit stops at final race of 2016 season with 100 limit:

```java
Ergast ergast = new Ergast(2016, 100, Ergast.DEFAULT_OFFSET);
ergast.getRacePitStops(21).forEach(System.out::println);
```

## Help
It would be cool, if you review the code or create a pull request.
