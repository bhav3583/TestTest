$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("excercise.feature");
formatter.feature({
  "line": 1,
  "name": "Tile filtering",
  "description": "\r\nAs a user I would like to filter the animal with life span",
  "id": "tile-filtering",
  "keyword": "Feature"
});
formatter.before({
  "duration": 21906907900,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on hompage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 7,
  "name": "User navigates smart Client page and filter the search with tile filtering",
  "description": "",
  "id": "tile-filtering;user-navigates-smart-client-page-and-filter-the-search-with-tile-filtering",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I click on tile and filtering",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I set animal using letter \"a\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I set life span to 40",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select \"Life Span\" from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select checkbox to ascending",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify result contain more than 12 items",
  "keyword": "Then "
});
formatter.match({
  "location": "filtering.iClickOnTileAndFiltering()"
});
formatter.result({
  "duration": 1944489700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a",
      "offset": 27
    }
  ],
  "location": "filtering.iSetAnimalUsingLetter(String)"
});
formatter.result({
  "duration": 895482300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "40",
      "offset": 19
    }
  ],
  "location": "filtering.iSetLifeSpanTo(int)"
});
formatter.result({
  "duration": 1264760400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Life Span",
      "offset": 10
    }
  ],
  "location": "filtering.iSelectFromDropdown(String)"
});
formatter.result({
  "duration": 3527091800,
  "status": "passed"
});
formatter.match({
  "location": "filtering.iSelectCheckboxToAscending()"
});
formatter.result({
  "duration": 213343500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 34
    }
  ],
  "location": "filtering.iVerifyResultContainMoreThanItems(int)"
});
formatter.result({
  "duration": 116224800,
  "status": "passed"
});
formatter.after({
  "duration": 1808084100,
  "status": "passed"
});
formatter.before({
  "duration": 14053048900,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on hompage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 16,
  "name": "User navigates to smart Client page and filter the search with grid filtering",
  "description": "",
  "id": "tile-filtering;user-navigates-to-smart-client-page-and-filter-the-search-with-grid-filtering",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I click on dropdown grid",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "when I select excercise from the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I able to select Excercise",
  "keyword": "Then "
});
formatter.match({
  "location": "filtering.iClickOnDropdownGrid()"
});
formatter.result({
  "duration": 1781831800,
  "status": "passed"
});
formatter.match({
  "location": "filtering.whenISelectExcerciseFromTheDropdown()"
});
formatter.result({
  "duration": 365903400,
  "status": "passed"
});
formatter.match({
  "location": "filtering.iAbleToSelectExcercise()"
});
formatter.result({
  "duration": 1177029300,
  "status": "passed"
});
formatter.after({
  "duration": 1269023600,
  "status": "passed"
});
});