package test_case

import category.TestTarget2
import category.TestTarget1
import org.junit.Rule
import org.junit.experimental.categories.Category
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise
import spock.lang.Unroll

import java.time.format.DateTimeFormatter


import com.jacob.activeX.ActiveXComponent
import com.jacob.com.ComThread
import com.jacob.com.Dispatch
import com.jacob.com.Variant

import java.util.regex.Matcher
import java.util.regex.Pattern

@Stepwise
@Category(TestTarget1)
class TX_100_ITa_CondGrp_0011 extends Specification {

    static boolean success

    @Shared
    static ActiveXComponent SAPROTWr, GUIApp, Connection, Session
    @Shared
    static Dispatch ROTEntry
    @Shared
    static Variant ScriptEngine;
    @Shared
    static Map<String, String> resultVar = new HashMap<String, String>()
    
    //TODO
    // 2020-02-04_001

    def setup() { // 毎回テストの前に実行される
        success = false
   }

    def cleanup() { // 毎回テストの後に実行される
        if (!success) {
            //TODO エラー時のスクリーンショットハンドリング
        }
    }

    def setupSpec() { // 初回テストの前に１回だけ実行される

        ComThread.InitSTA();

        //-Set SapGuiAuto = GetObject("SAPGUI")---------------------------
        SAPROTWr = new ActiveXComponent("SapROTWr.SapROTWrapper");
        ROTEntry = SAPROTWr.invoke("GetROTEntry", "SAPGUI").toDispatch();
        //-Set application = SapGuiAuto.GetScriptingEngine------------
        ScriptEngine = Dispatch.call(ROTEntry, "GetScriptingEngine");
        GUIApp = new ActiveXComponent(ScriptEngine.toDispatch());
        //-Set connection = application.Children(0)-------------------
        Connection = new ActiveXComponent(
                GUIApp.invoke("Children", 0).toDispatch());
        //-Set session = connection.Children(0)-----------------------
        Session = new ActiveXComponent(
                Connection.invoke("Children", 0).toDispatch());
    }

    def cleanupSpec() { // 初回テストの後に１回だけ実行される
        ComThread.Release();
    }

    
@Unroll
def "conGrp：1 con：1 Scenario_事前シナリオ_画面 項番：1 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00111.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00111.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：2 Scenario_事前シナリオ_画面 項番：2 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00112.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00112.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：3 Scenario_事前シナリオ_画面 項番：3 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：4 Scenario_事前シナリオ_画面 項番：4 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00113.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00113.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：5 Scenario_事前シナリオ_画面 項番：5 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00114.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00114.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：6 Scenario_事前シナリオ_画面 項番：6 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}


@Unroll
def "conGrp：1 con：7 Scenario_事前シナリオ_画面 項番：1 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00115.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00115.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_事前シナリオ_画面 項番：2 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00116.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00116.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_事前シナリオ_画面 項番：3 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_事前シナリオ_画面 項番：4 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00117.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00117.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_事前シナリオ_画面 項番：5 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00118.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00118.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_事前シナリオ_画面 項番：6 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_初期画面 項番：1 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00119.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00119.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名(トランザクションコード)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_初期画面 項番：2 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001110.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001110.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_初期画面 項番：3 ループ：1"() {

    given:

    when: "受注伝票登録画面の表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "受注伝票登録:第一画面"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001111.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001111.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_条件入力 項番：1 ループ：1"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-AUART").toDispatch())).setProperty("text", "ZFMR")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-VKORG").toDispatch())).setProperty("text", "F001")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-VTWEG").toDispatch())).setProperty("text", "Z1")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-SPART").toDispatch())).setProperty("text", "Z1")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001112.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001112.bmp")
    
    then: "Function(入力_画面・データ)、画面名(受注伝票登録_第一画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_条件入力 項番：2 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001113.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001113.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_条件入力 項番：3 ループ：1"() {

    given:

    when: "基本契約入力基本契約入力ポップアップの表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "登録 内貸販売(海上・パイプライン)(燃料油):概要"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001114.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001114.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_受注ヘッダ登録 項番：1 ループ：1"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/subSUBSCREEN_HEADER:SAPMV45A:8082/subPART-SUB:SAPMV45A:8084/ctxtKUAGV-KUNNR").toDispatch())).setProperty("text", "5770650010")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/subSUBSCREEN_HEADER:SAPMV45A:8082/subPART-SUB:SAPMV45A:8084/ctxtKUWEV-KUNNR").toDispatch())).setProperty("text", "5770650044")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001115.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001115.bmp")
    
    then: "Function(入力_画面・データ)、画面名(受注伝票ヘッダ登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_受注ヘッダ登録 項番：2 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001116.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001116.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_受注ヘッダ登録 項番：3 ループ：1"() {

    given:

    when: "受注伝票明細登録画面の表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "登録 内貸販売(海上・パイプライン)(燃料油):概要"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001117.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001117.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 loop_Scenario_VA01_明細登録 項番：1 ループ：1-1"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtRV45A-MABNR[2,0]").toDispatch())).setProperty("text", "F00220000")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtRV45A-KWMENG[3,0]").toDispatch())).setProperty("text", "1")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-WERKS[9,0]").toDispatch())).setProperty("text", "F201")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-LGORT[10,0]").toDispatch())).setProperty("text", "FZ10")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtVBAP-ARKTX[7,0]").toDispatch())).setProperty("text", "硫黄モルトン　バラ　商品")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-OIC_MOT[17,0]").toDispatch())).setProperty("text", "16")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001118.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001118.bmp")
    
    then: "Function(入力_画面・データ)、画面名(明細登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 loop_Scenario_VA01_明細登録 項番：1 ループ：1-2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001119.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001119.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 loop_Scenario_VA01_明細登録 項番：1 ループ：1-3"() {

    given:

    when: "1～4で入力した数値に紐づいて品目テキストなどが自動採番されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtVBAP-ARKTX[7,0]").toDispatch())).getProperty("text").toString() == "硫黄モルトン　バラ　商品"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001120.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001120.bmp")
    
    then: "Function(表示有無を確認)、画面名(明細登録)、画面項目名(テキスト)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_外部詳細画面遷移 項番：1 ループ：1"() {

    given:

    when: "明細左のボタンをクリック"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/subSUBSCREEN_BUTTONS:SAPMV45A:4050/btnBT_MKAL").toDispatch())).invoke("press")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001121.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001121.bmp")
    
    then: "Function(クリック)、画面名(受注伝票登録フッタ)、画面項目名(全選択)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_外部詳細画面遷移 項番：2 ループ：1"() {

    given:

    when: "外部詳細ボタンをクリック"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/subSUBSCREEN_BUTTONS:SAPMV45A:4050/btnEXT_DTLS_PB").toDispatch())).invoke("press")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001122.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001122.bmp")
    
    then: "Function(クリック)、画面名(受注伝票登録フッタ)、画面項目名(外部詳細)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_外部詳細画面遷移 項番：3 ループ：1"() {

    given:

    when: "外部詳細ポップアップが表示されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "外部詳細"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001123.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001123.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_外部詳細登録 項番：1 ループ：1"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/txtOIC_PIPE-OIC_PTRIP").toDispatch())).setProperty("text", "17")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/ctxtOIC_PIPE-OIC_MOT").toDispatch())).setProperty("text", "16")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/ctxtOIC_PIPE-OIC_TRUCKN").toDispatch())).setProperty("text", "A00030")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001124.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001124.bmp")
    
    then: "Function(入力_画面・データ)、画面名(外部詳細登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_外部詳細登録 項番：2 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001125.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001125.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_外部詳細登録 項番：3 ループ：1"() {

    given:

    when: "入力データが反映されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-OIC_MOT[17,0]").toDispatch())).getProperty("text").toString() == "16"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001126.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001126.bmp")
    
    then: "Function(表示有無を確認)、画面名(明細登録)、画面項目名(MT)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_変更結果 項番：1 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001127.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001127.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_変更結果2 項番：1 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001128.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001128.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_変更結果3 項番：1 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001129.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001129.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_保存ボタン押下 項番：1 ループ：1"() {

    given:

    when: "保存ボタンを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 11)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001130.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001130.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_受注伝票採番 項番：1 ループ：1"() {

    given:

    when: "左下に受注伝票番号が表示されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/sbar/pane[0]").toDispatch())).getProperty("text").toString() == "内貸販売(海上・パイプライン)(燃料油)[0-9]{10}が保存されました"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001131.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001131.bmp")
    
    then: "Function(表示有無を確認)、画面名(共通バー)、画面項目名(ステータスバー)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_VA01_受注伝票採番 項番：2 ループ：1"() {

    given:

    when: "受注伝票番号を表示する。"
    if(!resultVar.containsKey("受注伝票番号")) {
    String text = (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/sbar").toDispatch())).getProperty("text").toString()
    String regex = "[0-9]+"
    Pattern pattern
    Matcher matcher
    pattern = Pattern.compile(regex)
    matcher = pattern.matcher(text)
    while(matcher.find()) {
        resultVar.put("受注伝票番号", matcher.group())
    }
}
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001132.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001132.bmp")
    
    then: "Function(セレクタバーから番号を取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_事後シナリオ_画面 項番：1 ループ：1"() {

    given:

    when: "メニュー画面に戻る"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 15)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001133.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001133.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：7 Scenario_事後シナリオ_画面 項番：2 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001134.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001134.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_事前シナリオ_画面 項番：1 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001135.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001135.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_事前シナリオ_画面 項番：2 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001136.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001136.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_事前シナリオ_画面 項番：3 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_事前シナリオ_画面 項番：4 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001137.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001137.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_事前シナリオ_画面 項番：5 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001138.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001138.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_事前シナリオ_画面 項番：6 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_初期画面 項番：1 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001139.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001139.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名(トランザクションコード)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_初期画面 項番：2 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001140.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001140.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_初期画面 項番：3 ループ：1"() {

    given:

    when: "受注伝票登録画面の表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "受注伝票登録:第一画面"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001141.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001141.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_条件入力 項番：1 ループ：1"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-AUART").toDispatch())).setProperty("text", "ZFMR")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-VTWEG").toDispatch())).setProperty("text", "Z1")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-VKORG").toDispatch())).setProperty("text", "F001")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-SPART").toDispatch())).setProperty("text", "Z1")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001142.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001142.bmp")
    
    then: "Function(入力_画面・データ)、画面名(受注伝票登録_第一画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_条件入力 項番：2 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001143.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001143.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_条件入力 項番：3 ループ：1"() {

    given:

    when: "基本契約入力基本契約入力ポップアップの表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "登録 内貸販売(海上・パイプライン)(燃料油):概要"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001144.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001144.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_受注ヘッダ登録 項番：1 ループ：1"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/subSUBSCREEN_HEADER:SAPMV45A:8082/subPART-SUB:SAPMV45A:8084/ctxtKUAGV-KUNNR").toDispatch())).setProperty("text", "5770650010")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/subSUBSCREEN_HEADER:SAPMV45A:8082/subPART-SUB:SAPMV45A:8084/ctxtKUWEV-KUNNR").toDispatch())).setProperty("text", "5770650044")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001145.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001145.bmp")
    
    then: "Function(入力_画面・データ)、画面名(受注伝票ヘッダ登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_受注ヘッダ登録 項番：2 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001146.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001146.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_受注ヘッダ登録 項番：3 ループ：1"() {

    given:

    when: "受注伝票明細登録画面の表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "登録 内貸販売(海上・パイプライン)(燃料油):概要"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001147.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001147.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 loop_Scenario_VA01_明細登録 項番：1 ループ：1-1"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtRV45A-MABNR[2,0]").toDispatch())).setProperty("text", "F00220000")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtRV45A-KWMENG[3,0]").toDispatch())).setProperty("text", "1")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-WERKS[9,0]").toDispatch())).setProperty("text", "F201")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-LGORT[10,0]").toDispatch())).setProperty("text", "FZ10")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtVBAP-ARKTX[7,0]").toDispatch())).setProperty("text", "硫黄モルトン　バラ　商品")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-OIC_MOT[17,0]").toDispatch())).setProperty("text", "16")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001148.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001148.bmp")
    
    then: "Function(入力_画面・データ)、画面名(明細登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 loop_Scenario_VA01_明細登録 項番：1 ループ：1-2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001149.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001149.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 loop_Scenario_VA01_明細登録 項番：1 ループ：1-3"() {

    given:

    when: "1～4で入力した数値に紐づいて品目テキストなどが自動採番されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtVBAP-ARKTX[7,0]").toDispatch())).getProperty("text").toString() == "硫黄モルトン　バラ　商品"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001150.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001150.bmp")
    
    then: "Function(表示有無を確認)、画面名(明細登録)、画面項目名(テキスト)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_外部詳細画面遷移 項番：1 ループ：1"() {

    given:

    when: "明細左のボタンをクリック"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/subSUBSCREEN_BUTTONS:SAPMV45A:4050/btnBT_MKAL").toDispatch())).invoke("press")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001151.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001151.bmp")
    
    then: "Function(クリック)、画面名(受注伝票登録フッタ)、画面項目名(全選択)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_外部詳細画面遷移 項番：2 ループ：1"() {

    given:

    when: "外部詳細ボタンをクリック"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/subSUBSCREEN_BUTTONS:SAPMV45A:4050/btnEXT_DTLS_PB").toDispatch())).invoke("press")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001152.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001152.bmp")
    
    then: "Function(クリック)、画面名(受注伝票登録フッタ)、画面項目名(外部詳細)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_外部詳細画面遷移 項番：3 ループ：1"() {

    given:

    when: "外部詳細ポップアップが表示されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "外部詳細"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001153.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001153.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_外部詳細登録 項番：1 ループ：1"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/txtOIC_PIPE-OIC_PTRIP").toDispatch())).setProperty("text", "17")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/ctxtOIC_PIPE-OIC_MOT").toDispatch())).setProperty("text", "16")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/ctxtOIC_PIPE-OIC_TRUCKN").toDispatch())).setProperty("text", "A00030")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001154.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001154.bmp")
    
    then: "Function(入力_画面・データ)、画面名(外部詳細登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_外部詳細登録 項番：2 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001155.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001155.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_外部詳細登録 項番：3 ループ：1"() {

    given:

    when: "入力データが反映されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-OIC_MOT[17,0]").toDispatch())).getProperty("text").toString() == "16"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001156.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001156.bmp")
    
    then: "Function(表示有無を確認)、画面名(明細登録)、画面項目名(MT)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_変更結果 項番：1 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001157.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001157.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_変更結果2 項番：1 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001158.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001158.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_変更結果3 項番：1 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001159.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001159.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_保存ボタン押下 項番：1 ループ：1"() {

    given:

    when: "保存ボタンを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 11)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001160.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001160.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_受注伝票採番 項番：1 ループ：1"() {

    given:

    when: "左下に受注伝票番号が表示されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/sbar/pane[0]").toDispatch())).getProperty("text").toString() == "内貸販売(海上・パイプライン)(燃料油)[0-9]{10}が保存されました"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001161.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001161.bmp")
    
    then: "Function(表示有無を確認)、画面名(共通バー)、画面項目名(ステータスバー)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_VA01_受注伝票採番 項番：2 ループ：1"() {

    given:

    when: "受注伝票番号を表示する。"
    if(!resultVar.containsKey("受注伝票番号")) {
    String text = (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/sbar").toDispatch())).getProperty("text").toString()
    String regex = "[0-9]+"
    Pattern pattern
    Matcher matcher
    pattern = Pattern.compile(regex)
    matcher = pattern.matcher(text)
    while(matcher.find()) {
        resultVar.put("受注伝票番号", matcher.group())
    }
}
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001162.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001162.bmp")
    
    then: "Function(セレクタバーから番号を取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_事後シナリオ_画面 項番：1 ループ：1"() {

    given:

    when: "メニュー画面に戻る"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 15)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001163.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001163.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：8 Scenario_事後シナリオ_画面 項番：2 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001164.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001164.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_事前シナリオ_画面 項番：1 ループ：2"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001165.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001165.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_事前シナリオ_画面 項番：2 ループ：2"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001166.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001166.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_事前シナリオ_画面 項番：3 ループ：2"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_事前シナリオ_画面 項番：4 ループ：2"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001167.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001167.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_事前シナリオ_画面 項番：5 ループ：2"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001168.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001168.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_事前シナリオ_画面 項番：6 ループ：2"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_初期画面 項番：1 ループ：2"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001169.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001169.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名(トランザクションコード)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_初期画面 項番：2 ループ：2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001170.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001170.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_初期画面 項番：3 ループ：2"() {

    given:

    when: "受注伝票登録画面の表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "受注伝票登録:第一画面"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001171.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001171.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_条件入力 項番：1 ループ：2"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-AUART").toDispatch())).setProperty("text", "ZFMR")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-VKORG").toDispatch())).setProperty("text", "F001")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-VTWEG").toDispatch())).setProperty("text", "Z1")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-SPART").toDispatch())).setProperty("text", "Z1")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001172.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001172.bmp")
    
    then: "Function(入力_画面・データ)、画面名(受注伝票登録_第一画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_条件入力 項番：2 ループ：2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001173.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001173.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_条件入力 項番：3 ループ：2"() {

    given:

    when: "基本契約入力基本契約入力ポップアップの表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "登録 内貸販売(海上・パイプライン)(燃料油):概要"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001174.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001174.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_受注ヘッダ登録 項番：1 ループ：2"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/subSUBSCREEN_HEADER:SAPMV45A:8082/subPART-SUB:SAPMV45A:8084/ctxtKUAGV-KUNNR").toDispatch())).setProperty("text", "5770650011")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/subSUBSCREEN_HEADER:SAPMV45A:8082/subPART-SUB:SAPMV45A:8084/ctxtKUWEV-KUNNR").toDispatch())).setProperty("text", "5770650045")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001175.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001175.bmp")
    
    then: "Function(入力_画面・データ)、画面名(受注伝票ヘッダ登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_受注ヘッダ登録 項番：2 ループ：2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001176.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001176.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_受注ヘッダ登録 項番：3 ループ：2"() {

    given:

    when: "受注伝票明細登録画面の表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "登録 内貸販売(海上・パイプライン)(燃料油):概要"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001177.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001177.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 loop_Scenario_VA01_明細登録 項番：1 ループ：2-1"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtRV45A-MABNR[2,0]").toDispatch())).setProperty("text", "F00220000")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtRV45A-KWMENG[3,0]").toDispatch())).setProperty("text", "20")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-WERKS[9,0]").toDispatch())).setProperty("text", "F201")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-LGORT[10,0]").toDispatch())).setProperty("text", "FZ10")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtVBAP-ARKTX[7,0]").toDispatch())).setProperty("text", "硫黄モルトン　バラ　商品")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-OIC_MOT[17,0]").toDispatch())).setProperty("text", "16")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001178.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001178.bmp")
    
    then: "Function(入力_画面・データ)、画面名(明細登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 loop_Scenario_VA01_明細登録 項番：1 ループ：2-2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001179.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001179.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 loop_Scenario_VA01_明細登録 項番：1 ループ：2-3"() {

    given:

    when: "1～4で入力した数値に紐づいて品目テキストなどが自動採番されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtVBAP-ARKTX[7,0]").toDispatch())).getProperty("text").toString() == "硫黄モルトン　バラ　商品"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001180.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001180.bmp")
    
    then: "Function(表示有無を確認)、画面名(明細登録)、画面項目名(テキスト)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 loop_Scenario_VA01_明細登録 項番：1 ループ：2-4"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtRV45A-MABNR[2,0]").toDispatch())).setProperty("text", "F00220000")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtRV45A-KWMENG[3,0]").toDispatch())).setProperty("text", "10")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-WERKS[9,0]").toDispatch())).setProperty("text", "F201")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-LGORT[10,0]").toDispatch())).setProperty("text", "FZ10")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtVBAP-ARKTX[7,0]").toDispatch())).setProperty("text", "硫黄モルトン　バラ　商品")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-OIC_MOT[17,0]").toDispatch())).setProperty("text", "16")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001181.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001181.bmp")
    
    then: "Function(入力_画面・データ)、画面名(明細登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 loop_Scenario_VA01_明細登録 項番：1 ループ：2-5"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001182.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001182.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 loop_Scenario_VA01_明細登録 項番：1 ループ：2-6"() {

    given:

    when: "1～4で入力した数値に紐づいて品目テキストなどが自動採番されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtVBAP-ARKTX[7,0]").toDispatch())).getProperty("text").toString() == "硫黄モルトン　バラ　商品"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001183.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001183.bmp")
    
    then: "Function(表示有無を確認)、画面名(明細登録)、画面項目名(テキスト)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_外部詳細画面遷移 項番：1 ループ：2"() {

    given:

    when: "明細左のボタンをクリック"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/subSUBSCREEN_BUTTONS:SAPMV45A:4050/btnBT_MKAL").toDispatch())).invoke("press")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001184.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001184.bmp")
    
    then: "Function(クリック)、画面名(受注伝票登録フッタ)、画面項目名(全選択)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_外部詳細画面遷移 項番：2 ループ：2"() {

    given:

    when: "外部詳細ボタンをクリック"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/subSUBSCREEN_BUTTONS:SAPMV45A:4050/btnEXT_DTLS_PB").toDispatch())).invoke("press")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001185.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001185.bmp")
    
    then: "Function(クリック)、画面名(受注伝票登録フッタ)、画面項目名(外部詳細)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_外部詳細画面遷移 項番：3 ループ：2"() {

    given:

    when: "外部詳細ポップアップが表示されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "外部詳細"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001186.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001186.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_外部詳細登録 項番：1 ループ：2"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/txtOIC_PIPE-OIC_PTRIP").toDispatch())).setProperty("text", "17")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/ctxtOIC_PIPE-OIC_MOT").toDispatch())).setProperty("text", "16")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/ctxtOIC_PIPE-OIC_TRUCKN").toDispatch())).setProperty("text", "A00030")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001187.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001187.bmp")
    
    then: "Function(入力_画面・データ)、画面名(外部詳細登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_外部詳細登録 項番：2 ループ：2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001188.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001188.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_外部詳細登録 項番：3 ループ：2"() {

    given:

    when: "入力データが反映されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-OIC_MOT[17,0]").toDispatch())).getProperty("text").toString() == "16"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001189.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001189.bmp")
    
    then: "Function(表示有無を確認)、画面名(明細登録)、画面項目名(MT)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_変更結果 項番：1 ループ：2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001190.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001190.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_変更結果2 項番：1 ループ：2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001191.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001191.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_変更結果3 項番：1 ループ：2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001192.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001192.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_保存ボタン押下 項番：1 ループ：2"() {

    given:

    when: "保存ボタンを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 11)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001193.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001193.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_受注伝票採番 項番：1 ループ：2"() {

    given:

    when: "左下に受注伝票番号が表示されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/sbar/pane[0]").toDispatch())).getProperty("text").toString() == "内貸販売(海上・パイプライン)(燃料油)[0-9]{10}が保存されました"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001194.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001194.bmp")
    
    then: "Function(表示有無を確認)、画面名(共通バー)、画面項目名(ステータスバー)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_VA01_受注伝票採番 項番：2 ループ：2"() {

    given:

    when: "受注伝票番号を表示する。"
    if(!resultVar.containsKey("受注伝票番号")) {
    String text = (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/sbar").toDispatch())).getProperty("text").toString()
    String regex = "[0-9]+"
    Pattern pattern
    Matcher matcher
    pattern = Pattern.compile(regex)
    matcher = pattern.matcher(text)
    while(matcher.find()) {
        resultVar.put("受注伝票番号", matcher.group())
    }
}
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001195.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001195.bmp")
    
    then: "Function(セレクタバーから番号を取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_事後シナリオ_画面 項番：1 ループ：2"() {

    given:

    when: "メニュー画面に戻る"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 15)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001196.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001196.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：9 Scenario_事後シナリオ_画面 項番：2 ループ：2"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001197.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001197.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_事前シナリオ_画面 項番：1 ループ：2"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001198.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001198.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_事前シナリオ_画面 項番：2 ループ：2"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001199.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001199.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_事前シナリオ_画面 項番：3 ループ：2"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_事前シナリオ_画面 項番：4 ループ：2"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011100.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011100.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_事前シナリオ_画面 項番：5 ループ：2"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011101.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011101.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_事前シナリオ_画面 項番：6 ループ：2"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_初期画面 項番：1 ループ：2"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011102.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011102.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名(トランザクションコード)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_初期画面 項番：2 ループ：2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011103.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011103.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_初期画面 項番：3 ループ：2"() {

    given:

    when: "受注伝票登録画面の表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "受注伝票登録:第一画面"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011104.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011104.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_条件入力 項番：1 ループ：2"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-AUART").toDispatch())).setProperty("text", "ZFMR")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-VTWEG").toDispatch())).setProperty("text", "Z1")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-VKORG").toDispatch())).setProperty("text", "F001")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-SPART").toDispatch())).setProperty("text", "Z1")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011105.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011105.bmp")
    
    then: "Function(入力_画面・データ)、画面名(受注伝票登録_第一画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_条件入力 項番：2 ループ：2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011106.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011106.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_条件入力 項番：3 ループ：2"() {

    given:

    when: "基本契約入力基本契約入力ポップアップの表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "登録 内貸販売(海上・パイプライン)(燃料油):概要"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011107.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011107.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_受注ヘッダ登録 項番：1 ループ：2"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/subSUBSCREEN_HEADER:SAPMV45A:8082/subPART-SUB:SAPMV45A:8084/ctxtKUAGV-KUNNR").toDispatch())).setProperty("text", "5770650010")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/subSUBSCREEN_HEADER:SAPMV45A:8082/subPART-SUB:SAPMV45A:8084/ctxtKUWEV-KUNNR").toDispatch())).setProperty("text", "5770650044")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011108.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011108.bmp")
    
    then: "Function(入力_画面・データ)、画面名(受注伝票ヘッダ登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_受注ヘッダ登録 項番：2 ループ：2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011109.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011109.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_受注ヘッダ登録 項番：3 ループ：2"() {

    given:

    when: "受注伝票明細登録画面の表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "登録 内貸販売(海上・パイプライン)(燃料油):概要"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011110.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011110.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 loop_Scenario_VA01_明細登録 項番：1 ループ：2-1"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtRV45A-MABNR[2,0]").toDispatch())).setProperty("text", "F00220000")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtRV45A-KWMENG[3,0]").toDispatch())).setProperty("text", "1")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-WERKS[9,0]").toDispatch())).setProperty("text", "F201")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-LGORT[10,0]").toDispatch())).setProperty("text", "FZ10")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtVBAP-ARKTX[7,0]").toDispatch())).setProperty("text", "硫黄モルトン　バラ　商品")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-OIC_MOT[17,0]").toDispatch())).setProperty("text", "16")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011111.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011111.bmp")
    
    then: "Function(入力_画面・データ)、画面名(明細登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 loop_Scenario_VA01_明細登録 項番：1 ループ：2-2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011112.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011112.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 loop_Scenario_VA01_明細登録 項番：1 ループ：2-3"() {

    given:

    when: "1～4で入力した数値に紐づいて品目テキストなどが自動採番されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtVBAP-ARKTX[7,0]").toDispatch())).getProperty("text").toString() == "硫黄モルトン　バラ　商品"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011113.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011113.bmp")
    
    then: "Function(表示有無を確認)、画面名(明細登録)、画面項目名(テキスト)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_外部詳細画面遷移 項番：1 ループ：2"() {

    given:

    when: "明細左のボタンをクリック"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/subSUBSCREEN_BUTTONS:SAPMV45A:4050/btnBT_MKAL").toDispatch())).invoke("press")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011114.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011114.bmp")
    
    then: "Function(クリック)、画面名(受注伝票登録フッタ)、画面項目名(全選択)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_外部詳細画面遷移 項番：2 ループ：2"() {

    given:

    when: "外部詳細ボタンをクリック"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/subSUBSCREEN_BUTTONS:SAPMV45A:4050/btnEXT_DTLS_PB").toDispatch())).invoke("press")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011115.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011115.bmp")
    
    then: "Function(クリック)、画面名(受注伝票登録フッタ)、画面項目名(外部詳細)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_外部詳細画面遷移 項番：3 ループ：2"() {

    given:

    when: "外部詳細ポップアップが表示されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "外部詳細"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011116.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011116.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_外部詳細登録 項番：1 ループ：2"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/txtOIC_PIPE-OIC_PTRIP").toDispatch())).setProperty("text", "17")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/ctxtOIC_PIPE-OIC_MOT").toDispatch())).setProperty("text", "16")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/ctxtOIC_PIPE-OIC_TRUCKN").toDispatch())).setProperty("text", "A00030")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011117.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011117.bmp")
    
    then: "Function(入力_画面・データ)、画面名(外部詳細登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_外部詳細登録 項番：2 ループ：2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011118.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011118.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_外部詳細登録 項番：3 ループ：2"() {

    given:

    when: "入力データが反映されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-OIC_MOT[17,0]").toDispatch())).getProperty("text").toString() == "16"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011119.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011119.bmp")
    
    then: "Function(表示有無を確認)、画面名(明細登録)、画面項目名(MT)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_変更結果 項番：1 ループ：2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011120.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011120.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_変更結果2 項番：1 ループ：2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011121.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011121.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_変更結果3 項番：1 ループ：2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011122.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011122.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_保存ボタン押下 項番：1 ループ：2"() {

    given:

    when: "保存ボタンを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 11)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011123.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011123.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_受注伝票採番 項番：1 ループ：2"() {

    given:

    when: "左下に受注伝票番号が表示されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/sbar/pane[0]").toDispatch())).getProperty("text").toString() == "内貸販売(海上・パイプライン)(燃料油)[0-9]{10}が保存されました"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011124.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011124.bmp")
    
    then: "Function(表示有無を確認)、画面名(共通バー)、画面項目名(ステータスバー)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_VA01_受注伝票採番 項番：2 ループ：2"() {

    given:

    when: "受注伝票番号を表示する。"
    if(!resultVar.containsKey("受注伝票番号")) {
    String text = (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/sbar").toDispatch())).getProperty("text").toString()
    String regex = "[0-9]+"
    Pattern pattern
    Matcher matcher
    pattern = Pattern.compile(regex)
    matcher = pattern.matcher(text)
    while(matcher.find()) {
        resultVar.put("受注伝票番号", matcher.group())
    }
}
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011125.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011125.bmp")
    
    then: "Function(セレクタバーから番号を取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_事後シナリオ_画面 項番：1 ループ：2"() {

    given:

    when: "メニュー画面に戻る"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 15)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011126.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011126.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：10 Scenario_事後シナリオ_画面 項番：2 ループ：2"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011127.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011127.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_事前シナリオ_画面 項番：1 ループ：3"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011128.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011128.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_事前シナリオ_画面 項番：2 ループ：3"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011129.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011129.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_事前シナリオ_画面 項番：3 ループ：3"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_事前シナリオ_画面 項番：4 ループ：3"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011130.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011130.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_事前シナリオ_画面 項番：5 ループ：3"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011131.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011131.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_事前シナリオ_画面 項番：6 ループ：3"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_初期画面 項番：1 ループ：3"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011132.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011132.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名(トランザクションコード)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_初期画面 項番：2 ループ：3"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011133.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011133.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_初期画面 項番：3 ループ：3"() {

    given:

    when: "受注伝票登録画面の表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "受注伝票登録:第一画面"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011134.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011134.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_条件入力 項番：1 ループ：3"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-AUART").toDispatch())).setProperty("text", "ZFMR")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-VKORG").toDispatch())).setProperty("text", "F001")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-VTWEG").toDispatch())).setProperty("text", "Z1")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-SPART").toDispatch())).setProperty("text", "Z1")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011135.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011135.bmp")
    
    then: "Function(入力_画面・データ)、画面名(受注伝票登録_第一画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_条件入力 項番：2 ループ：3"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011136.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011136.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_条件入力 項番：3 ループ：3"() {

    given:

    when: "基本契約入力基本契約入力ポップアップの表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "登録 内貸販売(海上・パイプライン)(燃料油):概要"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011137.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011137.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_受注ヘッダ登録 項番：1 ループ：3"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/subSUBSCREEN_HEADER:SAPMV45A:8082/subPART-SUB:SAPMV45A:8084/ctxtKUAGV-KUNNR").toDispatch())).setProperty("text", "5770650011")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/subSUBSCREEN_HEADER:SAPMV45A:8082/subPART-SUB:SAPMV45A:8084/ctxtKUWEV-KUNNR").toDispatch())).setProperty("text", "5770650046")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011138.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011138.bmp")
    
    then: "Function(入力_画面・データ)、画面名(受注伝票ヘッダ登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_受注ヘッダ登録 項番：2 ループ：3"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011139.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011139.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_受注ヘッダ登録 項番：3 ループ：3"() {

    given:

    when: "受注伝票明細登録画面の表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "登録 内貸販売(海上・パイプライン)(燃料油):概要"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011140.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011140.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_外部詳細画面遷移 項番：1 ループ：3"() {

    given:

    when: "明細左のボタンをクリック"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/subSUBSCREEN_BUTTONS:SAPMV45A:4050/btnBT_MKAL").toDispatch())).invoke("press")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011141.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011141.bmp")
    
    then: "Function(クリック)、画面名(受注伝票登録フッタ)、画面項目名(全選択)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_外部詳細画面遷移 項番：2 ループ：3"() {

    given:

    when: "外部詳細ボタンをクリック"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/subSUBSCREEN_BUTTONS:SAPMV45A:4050/btnEXT_DTLS_PB").toDispatch())).invoke("press")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011142.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011142.bmp")
    
    then: "Function(クリック)、画面名(受注伝票登録フッタ)、画面項目名(外部詳細)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_外部詳細画面遷移 項番：3 ループ：3"() {

    given:

    when: "外部詳細ポップアップが表示されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "外部詳細"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011143.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011143.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_外部詳細登録 項番：1 ループ：3"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/txtOIC_PIPE-OIC_PTRIP").toDispatch())).setProperty("text", "17")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/ctxtOIC_PIPE-OIC_MOT").toDispatch())).setProperty("text", "16")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/ctxtOIC_PIPE-OIC_TRUCKN").toDispatch())).setProperty("text", "A00030")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011144.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011144.bmp")
    
    then: "Function(入力_画面・データ)、画面名(外部詳細登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_外部詳細登録 項番：2 ループ：3"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011145.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011145.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_外部詳細登録 項番：3 ループ：3"() {

    given:

    when: "入力データが反映されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-OIC_MOT[17,0]").toDispatch())).getProperty("text").toString() == "16"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011146.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011146.bmp")
    
    then: "Function(表示有無を確認)、画面名(明細登録)、画面項目名(MT)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_変更結果 項番：1 ループ：3"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011147.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011147.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_変更結果2 項番：1 ループ：3"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011148.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011148.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_変更結果3 項番：1 ループ：3"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011149.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011149.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_保存ボタン押下 項番：1 ループ：3"() {

    given:

    when: "保存ボタンを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 11)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011150.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011150.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_受注伝票採番 項番：1 ループ：3"() {

    given:

    when: "左下に受注伝票番号が表示されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/sbar/pane[0]").toDispatch())).getProperty("text").toString() == "内貸販売(海上・パイプライン)(燃料油)[0-9]{10}が保存されました"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011151.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011151.bmp")
    
    then: "Function(表示有無を確認)、画面名(共通バー)、画面項目名(ステータスバー)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_VA01_受注伝票採番 項番：2 ループ：3"() {

    given:

    when: "受注伝票番号を表示する。"
    if(!resultVar.containsKey("受注伝票番号")) {
    String text = (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/sbar").toDispatch())).getProperty("text").toString()
    String regex = "[0-9]+"
    Pattern pattern
    Matcher matcher
    pattern = Pattern.compile(regex)
    matcher = pattern.matcher(text)
    while(matcher.find()) {
        resultVar.put("受注伝票番号", matcher.group())
    }
}
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011152.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011152.bmp")
    
    then: "Function(セレクタバーから番号を取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_事後シナリオ_画面 項番：1 ループ：3"() {

    given:

    when: "メニュー画面に戻る"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 15)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011153.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011153.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：11 Scenario_事後シナリオ_画面 項番：2 ループ：3"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011154.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011154.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_事前シナリオ_画面 項番：1 ループ：3"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011155.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011155.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_事前シナリオ_画面 項番：2 ループ：3"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011156.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011156.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_事前シナリオ_画面 項番：3 ループ：3"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_事前シナリオ_画面 項番：4 ループ：3"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011157.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011157.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_事前シナリオ_画面 項番：5 ループ：3"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011158.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011158.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_事前シナリオ_画面 項番：6 ループ：3"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_初期画面 項番：1 ループ：3"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011159.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011159.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名(トランザクションコード)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_初期画面 項番：2 ループ：3"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011160.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011160.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_初期画面 項番：3 ループ：3"() {

    given:

    when: "受注伝票登録画面の表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "受注伝票登録:第一画面"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011161.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011161.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_条件入力 項番：1 ループ：3"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-AUART").toDispatch())).setProperty("text", "ZFMR")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-VTWEG").toDispatch())).setProperty("text", "Z1")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-VKORG").toDispatch())).setProperty("text", "F001")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-SPART").toDispatch())).setProperty("text", "Z1")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011162.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011162.bmp")
    
    then: "Function(入力_画面・データ)、画面名(受注伝票登録_第一画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_条件入力 項番：2 ループ：3"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011163.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011163.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_条件入力 項番：3 ループ：3"() {

    given:

    when: "基本契約入力基本契約入力ポップアップの表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "登録 内貸販売(海上・パイプライン)(燃料油):概要"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011164.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011164.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_受注ヘッダ登録 項番：1 ループ：3"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/subSUBSCREEN_HEADER:SAPMV45A:8082/subPART-SUB:SAPMV45A:8084/ctxtKUAGV-KUNNR").toDispatch())).setProperty("text", "5770650010")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/subSUBSCREEN_HEADER:SAPMV45A:8082/subPART-SUB:SAPMV45A:8084/ctxtKUWEV-KUNNR").toDispatch())).setProperty("text", "5770650044")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011165.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011165.bmp")
    
    then: "Function(入力_画面・データ)、画面名(受注伝票ヘッダ登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_受注ヘッダ登録 項番：2 ループ：3"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011166.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011166.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_受注ヘッダ登録 項番：3 ループ：3"() {

    given:

    when: "受注伝票明細登録画面の表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "登録 内貸販売(海上・パイプライン)(燃料油):概要"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011167.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011167.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 loop_Scenario_VA01_明細登録 項番：1 ループ：3-1"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtRV45A-MABNR[2,0]").toDispatch())).setProperty("text", "F00220000")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtRV45A-KWMENG[3,0]").toDispatch())).setProperty("text", "1")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-WERKS[9,0]").toDispatch())).setProperty("text", "F201")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-LGORT[10,0]").toDispatch())).setProperty("text", "FZ10")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtVBAP-ARKTX[7,0]").toDispatch())).setProperty("text", "硫黄モルトン　バラ　商品")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-OIC_MOT[17,0]").toDispatch())).setProperty("text", "16")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011168.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011168.bmp")
    
    then: "Function(入力_画面・データ)、画面名(明細登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 loop_Scenario_VA01_明細登録 項番：1 ループ：3-2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011169.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011169.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 loop_Scenario_VA01_明細登録 項番：1 ループ：3-3"() {

    given:

    when: "1～4で入力した数値に紐づいて品目テキストなどが自動採番されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtVBAP-ARKTX[7,0]").toDispatch())).getProperty("text").toString() == "硫黄モルトン　バラ　商品"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011170.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011170.bmp")
    
    then: "Function(表示有無を確認)、画面名(明細登録)、画面項目名(テキスト)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_外部詳細画面遷移 項番：1 ループ：3"() {

    given:

    when: "明細左のボタンをクリック"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/subSUBSCREEN_BUTTONS:SAPMV45A:4050/btnBT_MKAL").toDispatch())).invoke("press")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011171.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011171.bmp")
    
    then: "Function(クリック)、画面名(受注伝票登録フッタ)、画面項目名(全選択)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_外部詳細画面遷移 項番：2 ループ：3"() {

    given:

    when: "外部詳細ボタンをクリック"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/subSUBSCREEN_BUTTONS:SAPMV45A:4050/btnEXT_DTLS_PB").toDispatch())).invoke("press")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011172.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011172.bmp")
    
    then: "Function(クリック)、画面名(受注伝票登録フッタ)、画面項目名(外部詳細)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_外部詳細画面遷移 項番：3 ループ：3"() {

    given:

    when: "外部詳細ポップアップが表示されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "外部詳細"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011173.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011173.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_外部詳細登録 項番：1 ループ：3"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/txtOIC_PIPE-OIC_PTRIP").toDispatch())).setProperty("text", "17")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/ctxtOIC_PIPE-OIC_MOT").toDispatch())).setProperty("text", "16")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/ctxtOIC_PIPE-OIC_TRUCKN").toDispatch())).setProperty("text", "A00030")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011174.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011174.bmp")
    
    then: "Function(入力_画面・データ)、画面名(外部詳細登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_外部詳細登録 項番：2 ループ：3"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011175.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011175.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_外部詳細登録 項番：3 ループ：3"() {

    given:

    when: "入力データが反映されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-OIC_MOT[17,0]").toDispatch())).getProperty("text").toString() == "16"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011176.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011176.bmp")
    
    then: "Function(表示有無を確認)、画面名(明細登録)、画面項目名(MT)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_変更結果 項番：1 ループ：3"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011177.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011177.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_変更結果2 項番：1 ループ：3"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011178.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011178.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_変更結果3 項番：1 ループ：3"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011179.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011179.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_保存ボタン押下 項番：1 ループ：3"() {

    given:

    when: "保存ボタンを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 11)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011180.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011180.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_受注伝票採番 項番：1 ループ：3"() {

    given:

    when: "左下に受注伝票番号が表示されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/sbar/pane[0]").toDispatch())).getProperty("text").toString() == "内貸販売(海上・パイプライン)(燃料油)[0-9]{10}が保存されました"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011181.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011181.bmp")
    
    then: "Function(表示有無を確認)、画面名(共通バー)、画面項目名(ステータスバー)"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_VA01_受注伝票採番 項番：2 ループ：3"() {

    given:

    when: "受注伝票番号を表示する。"
    if(!resultVar.containsKey("受注伝票番号")) {
    String text = (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/sbar").toDispatch())).getProperty("text").toString()
    String regex = "[0-9]+"
    Pattern pattern
    Matcher matcher
    pattern = Pattern.compile(regex)
    matcher = pattern.matcher(text)
    while(matcher.find()) {
        resultVar.put("受注伝票番号", matcher.group())
    }
}
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011182.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011182.bmp")
    
    then: "Function(セレクタバーから番号を取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_事後シナリオ_画面 項番：1 ループ：3"() {

    given:

    when: "メニュー画面に戻る"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 15)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011183.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011183.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：12 Scenario_事後シナリオ_画面 項番：2 ループ：3"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011184.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011184.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}


@Unroll
def "conGrp：1 con：13 Scenario_事後シナリオ_画面 項番：1 ループ：3"() {

    given:

    when: "メニュー画面に戻る"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 15)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011185.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011185.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：1 con：14 Scenario_事後シナリオ_画面 項番：2 ループ：3"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_0011186.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_0011186.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}


}

