Feature:  在百度中搜索

  @TestngScenario
  Scenario: 搜索testng
    Given  打开百度，验证title
    When  输入 "testng"
    Then  点击搜索按钮
    Then  清除搜索框