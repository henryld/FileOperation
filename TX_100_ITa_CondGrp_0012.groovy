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
class TX_100_ITa_CondGrp_0012 extends Specification {

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
def "conGrp：2 con：1 Scenario_事前シナリオ_画面 項番：1 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00121.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00121.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：2 Scenario_事前シナリオ_画面 項番：2 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00122.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00122.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：3 Scenario_事前シナリオ_画面 項番：3 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：4 Scenario_事前シナリオ_画面 項番：4 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00123.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00123.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：5 Scenario_事前シナリオ_画面 項番：5 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00124.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00124.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：6 Scenario_事前シナリオ_画面 項番：6 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}


@Unroll
def "conGrp：2 con：7 Scenario_事前シナリオ_画面 項番：1 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00125.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00125.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_事前シナリオ_画面 項番：2 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00126.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00126.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_事前シナリオ_画面 項番：3 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_事前シナリオ_画面 項番：4 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00127.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00127.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_事前シナリオ_画面 項番：5 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00128.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00128.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_事前シナリオ_画面 項番：6 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_初期画面 項番：1 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_00129.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_00129.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名(トランザクションコード)"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_初期画面 項番：2 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001210.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001210.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_初期画面 項番：3 ループ：1"() {

    given:

    when: "受注伝票登録画面の表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "受注伝票登録:第一画面"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001211.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001211.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_条件入力 項番：1 ループ：1"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-AUART").toDispatch())).setProperty("text", "ZFMR")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-VKORG").toDispatch())).setProperty("text", "F001")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-VTWEG").toDispatch())).setProperty("text", "Z1")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/ctxtVBAK-SPART").toDispatch())).setProperty("text", "Z1")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001212.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001212.bmp")
    
    then: "Function(入力_画面・データ)、画面名(受注伝票登録_第一画面)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_条件入力 項番：2 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001213.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001213.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_条件入力 項番：3 ループ：1"() {

    given:

    when: "基本契約入力基本契約入力ポップアップの表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "登録 内貸販売(海上・パイプライン)(燃料油):概要"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001214.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001214.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_受注ヘッダ登録 項番：1 ループ：1"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/subSUBSCREEN_HEADER:SAPMV45A:8082/subPART-SUB:SAPMV45A:8084/ctxtKUAGV-KUNNR").toDispatch())).setProperty("text", "5770650010")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/subSUBSCREEN_HEADER:SAPMV45A:8082/subPART-SUB:SAPMV45A:8084/ctxtKUWEV-KUNNR").toDispatch())).setProperty("text", "5770650044")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001215.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001215.bmp")
    
    then: "Function(入力_画面・データ)、画面名(受注伝票ヘッダ登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_受注ヘッダ登録 項番：2 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001216.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001216.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_受注ヘッダ登録 項番：3 ループ：1"() {

    given:

    when: "受注伝票明細登録画面の表示確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "登録 内貸販売(海上・パイプライン)(燃料油):概要"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001217.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001217.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 loop_Scenario_VA01_明細登録 項番：1 ループ：1-1"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtRV45A-MABNR[2,0]").toDispatch())).setProperty("text", "F00220000")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtRV45A-KWMENG[3,0]").toDispatch())).setProperty("text", "3")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-WERKS[9,0]").toDispatch())).setProperty("text", "F201")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-LGORT[10,0]").toDispatch())).setProperty("text", "FZ10")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtVBAP-ARKTX[7,0]").toDispatch())).setProperty("text", "硫黄モルトン　バラ　商品")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-OIC_MOT[17,0]").toDispatch())).setProperty("text", "16")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001218.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001218.bmp")
    
    then: "Function(入力_画面・データ)、画面名(明細登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 loop_Scenario_VA01_明細登録 項番：1 ループ：1-2"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001219.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001219.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 loop_Scenario_VA01_明細登録 項番：1 ループ：1-3"() {

    given:

    when: "1～4で入力した数値に紐づいて品目テキストなどが自動採番されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/txtVBAP-ARKTX[7,0]").toDispatch())).getProperty("text").toString() == "硫黄モルトン　バラ　商品"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001220.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001220.bmp")
    
    then: "Function(表示有無を確認)、画面名(明細登録)、画面項目名(テキスト)"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_外部詳細画面遷移 項番：1 ループ：1"() {

    given:

    when: "明細左のボタンをクリック"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/subSUBSCREEN_BUTTONS:SAPMV45A:4050/btnBT_MKAL").toDispatch())).invoke("press")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001221.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001221.bmp")
    
    then: "Function(クリック)、画面名(受注伝票登録フッタ)、画面項目名(全選択)"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_外部詳細画面遷移 項番：2 ループ：1"() {

    given:

    when: "外部詳細ボタンをクリック"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/subSUBSCREEN_BUTTONS:SAPMV45A:4050/btnEXT_DTLS_PB").toDispatch())).invoke("press")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001222.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001222.bmp")
    
    then: "Function(クリック)、画面名(受注伝票登録フッタ)、画面項目名(外部詳細)"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_外部詳細画面遷移 項番：3 ループ：1"() {

    given:

    when: "外部詳細ポップアップが表示されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/titl").toDispatch())).getProperty("text").toString() == "外部詳細"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001223.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001223.bmp")
    
    then: "Function(画面タイトルを取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_外部詳細登録 項番：1 ループ：1"() {

    given:

    when: "「画面名」に記載された画面定義に対して、「データ名」に定義された項目にデータを入力する。"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/txtOIC_PIPE-OIC_PTRIP").toDispatch())).setProperty("text", "17")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/ctxtOIC_PIPE-OIC_MOT").toDispatch())).setProperty("text", "16")
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[1]/usr/ctxtOIC_PIPE-OIC_TRUCKN").toDispatch())).setProperty("text", "A00030")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001224.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001224.bmp")
    
    then: "Function(入力_画面・データ)、画面名(外部詳細登録)、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_外部詳細登録 項番：2 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001225.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001225.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_外部詳細登録 項番：3 ループ：1"() {

    given:

    when: "入力データが反映されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/usr/tabsTAXI_TABSTRIP_OVERVIEW/tabpT\\01/ssubSUBSCREEN_BODY:SAPMV45A:8083/subSUBSCREEN_TC:SAPMV45A:8086/tblSAPMV45ATCTRL_U_ERF_AUFTROIL/ctxtVBAP-OIC_MOT[17,0]").toDispatch())).getProperty("text").toString() == "16"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001226.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001226.bmp")
    
    then: "Function(表示有無を確認)、画面名(明細登録)、画面項目名(MT)"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_変更結果 項番：1 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001227.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001227.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_変更結果2 項番：1 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001228.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001228.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_変更結果3 項番：1 ループ：1"() {

    given:

    when: "Enterキーを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 0)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001229.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001229.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_保存ボタン押下 項番：1 ループ：1"() {

    given:

    when: "保存ボタンを押下"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 11)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001230.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001230.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_受注伝票採番 項番：1 ループ：1"() {

    given:

    when: "左下に受注伝票番号が表示されることを確認"
    (new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/sbar/pane[0]").toDispatch())).getProperty("text").toString() == "内貸販売(海上・パイプライン)(燃料油)[0-9]{10}が保存されました"
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001231.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001231.bmp")
    
    then: "Function(表示有無を確認)、画面名(共通バー)、画面項目名(ステータスバー)"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_VA01_受注伝票採番 項番：2 ループ：1"() {

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
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001232.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001232.bmp")
    
    then: "Function(セレクタバーから番号を取得)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_事後シナリオ_画面 項番：1 ループ：1"() {

    given:

    when: "メニュー画面に戻る"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 15)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001233.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001233.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：7 Scenario_事後シナリオ_画面 項番：2 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001234.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001234.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}


@Unroll
def "conGrp：2 con：8 Scenario_事後シナリオ_画面 項番：1 ループ：1"() {

    given:

    when: "メニュー画面に戻る"
    (new ActiveXComponent(Session.invoke("FindById","wnd[0]").toDispatch())).invoke("sendVKey", 15)
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001235.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001235.bmp")
    
    then: "Function(キー押下)、画面名()、画面項目名()"
    (success = true) != null
}

@Unroll
def "conGrp：2 con：9 Scenario_事後シナリオ_画面 項番：2 ループ：1"() {

    given:

    when: "VA01を入力"
    
(new ActiveXComponent(Session.invoke("FindById","/app/con[0]/ses[0]/wnd[0]/tbar[0]/okcd").toDispatch())).setProperty("text", "VA01")
    reportInfo "<img src='./img/TX_100_ITa_CondGrp_001236.bmp'>"
    (new ActiveXComponent(Session.invoke("FindById", "wnd[0]").toDispatch())).invoke("hardcopy", "C:\\Users\\heng.a.wu\\ASTA\\system\\testrunner\\target\\spock-reports\\img\\TX_100_ITa_CondGrp_001236.bmp")
    
    then: "Function(入力_画面・データ)、画面名(初期画面)、画面項目名()"
    (success = true) != null
}


}

