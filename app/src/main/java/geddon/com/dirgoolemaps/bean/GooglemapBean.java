package geddon.com.dirgoolemaps.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Geddon on 2019/11/6.
 */
public  class GooglemapBean implements Serializable {


    private String status;
    private List<GeocodedWaypointsBean> geocoded_waypoints;
    private List<RoutesBean> routes;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<GeocodedWaypointsBean> getGeocoded_waypoints() {
        return geocoded_waypoints;
    }

    public void setGeocoded_waypoints(List<GeocodedWaypointsBean> geocoded_waypoints) {
        this.geocoded_waypoints = geocoded_waypoints;
    }

    public List<RoutesBean> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RoutesBean> routes) {
        this.routes = routes;
    }

    public static class GeocodedWaypointsBean {
        /**
         * geocoder_status : OK
         * place_id : ChIJK_I1UZN2bjQRnLZaGDT61Rw
         * types : ["colloquial_area","locality","political"]
         */

        private String geocoder_status;
        private String place_id;
        private List<String> types;

        public String getGeocoder_status() {
            return geocoder_status;
        }

        public void setGeocoder_status(String geocoder_status) {
            this.geocoder_status = geocoder_status;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }
    }

    public static class RoutesBean {
        /**
         * bounds : {"northeast":{"lat":25.0329662,"lng":121.5973157},"southwest":{"lat":22.9973255,"lng":120.2269966}}
         * copyrights : 地图数据 ©2019 GS(2011)6020 Google
         * legs : [{"distance":{"text":"318 公里","value":317580},"duration":{"text":"3 小时 22 分钟","value":12114},"end_address":"台湾台北市","end_location":{"lat":25.0329662,"lng":121.5654019},"start_address":"台湾台南市东区台南","start_location":{"lat":22.9997357,"lng":120.2269966},"steps":[{"distance":{"text":"37 米","value":37},"duration":{"text":"1分钟","value":7},"end_location":{"lat":23.0000545,"lng":120.227089},"html_instructions":"从<b>小東路198巷6弄<\/b>向<b>北<\/b>行驶，到<b>小東路<\/b>/<wbr/><b>180縣道<\/b>","polyline":{"points":"kckkCwyx|U}@Q"},"start_location":{"lat":22.9997357,"lng":120.2269966},"travel_mode":"DRIVING"},{"distance":{"text":"1.3 公里","value":1348},"duration":{"text":"4分钟","value":262},"end_location":{"lat":22.9984355,"lng":120.2399823},"html_instructions":"向<b>右<\/b>转，进入<b>小東路<\/b>/<wbr/><b>180縣道<\/b>","maneuver":"turn-right","polyline":{"points":"iekkCizx|U\\cBJg@DUV}@dAiFh@_C\\eBPaAJi@TaAPaA@K@QJeCBg@Bi@Be@B[DcARgEAYEsD?mA?mA?{C?YAoA?cA@wCAYCu@?e@EkB"},"start_location":{"lat":23.0000545,"lng":120.227089},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 公里","value":813},"duration":{"text":"2分钟","value":113},"end_location":{"lat":22.9985328,"lng":120.2479188},"html_instructions":"继续直行进入<b>復興路<\/b>/<wbr/><b>180縣道<\/b>","maneuver":"straight","polyline":{"points":"g{jkC{j{|UEcAEm@?AEcAIeA@mB?k@?I@kB?g@?O@uB?uDAm@Aq@?k@@oB@wB?e@@iA?_B?SA_@BiA"},"start_location":{"lat":22.9984355,"lng":120.2399823},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 公里","value":155},"duration":{"text":"1分钟","value":25},"end_location":{"lat":22.9971398,"lng":120.2478922},"html_instructions":"向<b>右<\/b>转","maneuver":"turn-right","polyline":{"points":"y{jkCo|||Ud@?\\?P?n@?L?zADd@?"},"start_location":{"lat":22.9985328,"lng":120.2479188},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 公里","value":343},"duration":{"text":"1分钟","value":79},"end_location":{"lat":22.9995125,"lng":120.2484637},"html_instructions":"在<b>的第 1 个交叉路口向<\/b>左<b>復興路71巷<\/b>转","maneuver":"turn-left","polyline":{"points":"csjkCi|||UXS@C?A@O?UAM?OAG?CAAEEECKEsE@aA@I?M@kDB"},"start_location":{"lat":22.9971398,"lng":120.2478922},"travel_mode":"DRIVING"},{"distance":{"text":"131 公里","value":131488},"duration":{"text":"1 小时 18 分钟","value":4708},"end_location":{"lat":24.0980209,"lng":120.5493356},"html_instructions":"走<b>左侧<\/b>匝道，走<b>國道一號<\/b>/<wbr/><b>國道1號<\/b><div style=\"font-size:0.9em\">收费路段<\/div>","maneuver":"ramp-left","polyline":{"points":"}akkC{_}|UKDKBY@cDBQ?yA@gA@O?aDFiDFyA@uA@I@C@IFuII}CI}CQ}AMw@Ic@EkCYEAcBUc@GoDk@qDo@gE}@gCk@{@O]G]G}Co@iBYMCYG[EcAQUEe@GcAKiAIq@Eq@C}BEs@Ai@@[?iADy@DgAJo@HE?]FyKdB[F[DeDf@eCX_@B_@BiCVyFVi@@c@?[?Y@yFBwNYcBKq@Co@EmBM}AKeHs@yC[cFi@e@G_@EWCeBSKAeAOk@GEAa@EqLsAeIgAg@G_@C]EiHq@SCQAkEg@iJkAm@GsBUQCSA_CWqBOE?_@Cg@CeCMUCSAwJm@e@AWCWAkOYo@?g@@e@?}E?O?Q?cNES?S?qE?yA?S?U?kFBc@?iKFoGHu@@_@@_@?_LLgJJoCHiBHc@@qDLcBHoCH}CLwEPoFb@oADwFVkFToEVwAFc@B_BHiFZuGb@e@CoKhAsHd@mEXoDTSBeFh@}JnAsOfBwM~Ac@DmALu@JcEb@M@w@JcLzAiFz@k@J{JfB_I~AWFE?[H{JlB}H`BsBb@{A\\UD{KnCkAXaJdCoCv@u@Vw@Po@V{A`@yJxCmFdBm@Po@RuDjAsJhDaA^_@Lu@XODUHk@Tw@X_@N_@NC?]LwDpAuDrA[L}Bz@i@Ra@P_@NwAh@kAb@a@NcBl@_@Lq@VOFa@NaA\\_@NOFkC`A_@N]LC@cC~@_@NgBp@wDrAGBODKDgDlAsAb@cDhAuBn@iBh@uBn@gAXSFOBQFoCr@mFpAkB`@oCj@SDcBX{@NcBXg@HqBXy@Ja@DcJfAkCT{@HqIj@I@Y?[@eJT[@Y@sGJsKAm@AwCI_BEcBEaCKoAE}AKkCQiGg@e@E[E[GwBUiAIqFu@kC_@{@QuDm@sEy@i@Kg@I}JeBqAUi@Ii@IsB]eDg@kDi@sGeAoAQMCgGw@wLwAc@Ec@GuGi@iGi@{AMUAWCm@EYC_ES{DS_@A_@Ci@C{ES_@Ca@EgEIo@AWAmP[qFE{AAc@?{FCoCAc@?a@?wJAg@Ag@AgDE_@?oB@[?[?qHCk@Ak@AoA@gACc@Aa@A_OUuFSgACc@CcHUiCQ_DQ]C[AqD[eGi@uAQSCSCk@G[CYEgAMOAIAWCsAOmBU_Gy@}OkCsFmASGEA[GcOcDIAKCUG{A]wFeBwIiCe@OQIQGiCw@_KwDgIaDqFeCWMWKuD{AWMWKuDcBuDcBgKqE[O[Oe\\{N_@Og@U[O]Oo@[yDcBwI}DgEoBmGqC_EeB[OCAWKCAyGyC{M_GwAm@OGOIeGmC[KoAg@eHqC_Bk@SISImC_AgFoBoPgG{DwAa@OaBo@a@Ma@OSGKEo@U_HeCGASKKCIEc@OsEaBq@YsJaE{FwCOK]SeGuDi@]i@]_FsDqJkIOMWYYWgKsKYYwI_J}N_NgEcDmFsD]U[SuAy@MIOIa@W_Ak@{C_ByAw@cBy@kGwCiGaCeHmC_A]}@]w@[{@[}MeF}@_@_Aa@iCoAcFaC{CgB_@Um@]k@]gGsD_@Ym@a@]UWQECWS_@SEAQOgJkG}DsCe@]e@]a@YEEc@[oHwEg@[SMSO}AcA_IqE]S]QgSmKkBcA}BkAWMGCOGiBq@}FgCcJ}DYKYMeK_ESIKEICyD}A{GmC_Bo@UKIEMEmBy@wB_A{As@_@QeEmBkEuBkAm@wGmDUMIE_H}DgG_EkEsCs@g@gF_EeMaKu@o@y@w@yDqDkDkDqE}EyCkDwDoEq@_AQUk@s@MQOQOSw@kAiA_B}EmHoDkFgCkEU_@eL{RS_@CE}Qq]}EcJgEcIuM{TS[oAkB_BcCaA}A}G}IkBcCmCoDsBmCyAyAcCgCqGkGiHiGy@s@mEkDgD}BuDgCwA{@qEqCMIOI[ScL_GaJyDSKUIkGmCmMaEsC{@}@Ww@UOEQEy@S{Cs@kCk@_B[SEQEyB_@oDo@SCSEkH_AKASCUCuGs@oBQc@CsE_@oBKiEQwBI}@AO?M?yLOqNHU@U?Y?eV^S?U?_LTgMRS@Q@_ABI?O?_O\\mVXU?mC?uCCeFE{GQ}AEkBGmCOgCOSAUAeHi@wCU]CmAQWCa@EgFm@}Cc@k@IiC_@wCg@eEw@kAUeDq@oDw@QEMCOEqA[iBg@gD}@aEkAaCs@eA]u@WeDiAgDoAqBu@{@]kAg@sCmAaBq@_CiA{CwAo@[KGIEmDgBIGcE{BsCaBQKeGeDg@YUMQKaZgRqEuC_DiBoCaBEEGCKGgIqEs@a@aG{CMIICIEiFcCKEIEu@_@aA_@qGiCiE{AwDoAa@KMEMEuAa@cDy@y@UqCi@aGoAwLmBaa@_Gc@GcQgCuUoFQCQEeAU_EoAwKkDyGeCQGSIaDkAiLgFyL{Fq@]gBeA_@U}Q{K]WsA_Ak@[MIsDiCy@m@QOIGGEkCuBqA_AuCcCkB}A[WIGs@q@_@]a@[{NcNKKIIiFaFwFeFa@_@EEIGQOaEcDMKsDqCGEs@g@y@m@EC}AeAk@]_CuAu@a@eAm@CA_@SMG_@SqBaA{BaAeBs@_@MyEcBEAk@SOEoBk@gCs@eAWaBa@kAWaAQi@KwAUw@OaBSoAS}@KmBSQASCSAg@EiCU{CSgBKaFWyESKA[AoBIwGYs@EcAGwF_@MCWACAwAMaDa@{AUoB[IAaAQcB[IAqA[_AUkG}AgEkAeBg@a@Ka@Ka@M{Bo@mQ}EQEOGOEgI}B}C{@GASGQGqA]WI_@IwFuAa@K_@K_AWqZoIMEKCk@OuGoB_KyCQEgA[eBg@{QeFWGUIeIyBi@Og@OkDaAMEMCsCw@WIWIeGaBSGoDaA[I[KmDgA_Co@}Ac@YGYIaWiHeFuAeBm@]M[KcRuGu@[mHyCYKYK{HmDaAc@{HoDQIOGgHeDwLuFEAcDsA_@OiP{GUKUIqCiAcOkFsBm@WIYIsBm@iTyFSGSEgAY{@Uk@KWGYGeNqCcBWWEWEsDm@{B_@wAUYEWEcC]iEk@aAMYCWEcBSaCWuEe@a@EgAMUCUA{AOwFi@aCUeGi@SAA?oBS{@IQAQAoAKsAO_AKyAKcAK_NsAe@Ea@EE?iGk@qC_@cD]uCY}@I]E_@C]EuDe@_CS{@GgAKqAMy@IiBQoBS_@CKCkE_@kD_@yEe@yC]mC[mDa@u\\oEsOoCSESEkB[_JcBgEw@aEw@kDu@oCm@qBg@_Du@cDk@aJ}BcFsAaEcAw@U}Ag@qAa@e@MoCaAuBq@_Cw@aBi@aEwAoEyAQGSGc@OcDiA}@[kDmA_@MWKkAa@[M]Mm@Uq@W_@Oc@OgBq@YKcE_Bc@Oa@Qm@UaL{EaEeB[M_@QiHgDyAq@{Ao@c@UkCoASIcBy@c@Uc@UyAo@aEwB_Ae@]Sw@a@qAq@oAo@CAwDsBsGkDWMWOyC{AcKwFe@[AAm@[m@]qGoDQIQKWOkJcFMGMI{DsB}@g@{DsBKGIG}BmA{CaB}BmAkH{DQKIE{CaBsC}AOIOGaCoAOKQIkAo@{EcCuDcBOGMGgAg@aAc@CA_CaAIEIEqBy@oIeDu@WUGWIuE_BICqGoBwAa@MEOEoHwB_E}@u@Oa@KiCk@KCKC{A[a@Ia@IQCOE_F}@SCQCsE{@_IcAy@GQAQCsDWkE]qKm@SASAqAGA?a@A{FGkGGyHD}GN]@S@U@_BFmERiIl@iBLWBG@gFj@_Ef@gFz@kF|@cGrAWFWFYHyA\\sAZsFvAmEnASDGBYHUH{F|Am@Ny@TsLhDMDKBuCv@yFzA]HC@YHuA\\_IbBu@Pk@HODOBsJhBOBi@HiM`BqANaD\\iBNO@Q@uALM@M@cDVc@BeAHkBHc@B{CLkEJM?O?kJRo@?oF?I?I?]?qJGiCIWAUAcCGwKe@s@GyGe@oBQsNcBKAMCy@IcMoBOEQE_AQuBc@sBc@}Bg@A?QESEg@MiBa@_AUSEgAWaCo@w@Se@MwDaAaGeBC?]MgDeAOEOGkDcAsEyASGQGu@UiTkHuDsAw@Yk@QMGaA]mP{FaA]GAWKSGQGSIqDmAk@QcJwCGAk@S}@YgGiB}DiAmBk@WGWIiBc@wDaAiLsCKCm@MUGc@I]K{@QQEGAYGeCi@eAUIAUEuDo@GCGAyB_@KAKCu@MIAGAWEc@IkHmAuAQa@GmC]a@GsL_BaCUoPaBkJs@a@CcBMmG_@aGY_GS_EKUAC?_@?_HMoHGsCEc@AeAC]@c@?gA@_@AA?eA?c@?oC@kA@a@?G?uDFwEJ{ELoENyDLa@BO?Q@i@@kDHaENsELaEL{DNgDH_@@S@S@gBBgDFkCDuBB{BBQ?Q@kBBoAB_CBkCB{ABe@?c@AE?{AA[?aLGwDOy@Cy@EiEOQAcCOqF_@qDUaAKmFi@qB[oCYUC_C[w@Ma@IiB[yHsAGCgAQkKsB}@Q_AQkI_BeAUgASiH}AsBa@}Cm@wB]oFw@qAQs@KWCIA}H_AsE_@sFe@SASAin@iDG?KAE?EA}BO}BS}KcAgH}@mC[sAQwFgAiGmAcMqC_AUaG}AiFuAu@SeD}@gEiAmBg@OEOE_@I_EeAaB_@YGMEOCYGc@IKEKCqD}@kAUgB_@k@K_AQ{AUcC_@YCGAIAoH{@yHq@uBMmACO?OA}CGcEG}E@qFJiHRqDLkBFgTp@uM@c@?c@?S?aCCeIYqCMkD[mCSgCYgAM[EmAQm@K}GoA{Be@aEeAcCo@yBm@aEmA]KWIiEkAqC{@mC{@SIsDeAgBi@iA[cEmAICkCq@u@U{Bk@}@U{DaACAa@IkBe@_AS_AUiFeAkGkAiEs@kAOgDi@]EeC_@cC[eFk@wD]s@Gc@EgAIyBScDQKAK?WCiH_@oDMAAW?EA]?y@CmDKyCE_@AE?]AE?yDCuBC}K@_BByA@cBDY?M@qA@}@@c@@mDDuFJeBDS?U@iCDeHL_HLuEBc@?mLDkACc@?c@AmJOc@?G?[?MAw@?yBKyH]uCMyGc@UCSAWAsBOgCWsBSQA{BUa@Ec@GiBSWCOCsAQE?_@G_@GgBU}B]oB]{B[oASWEeC_@iSuCcNsBgOyBOAOCgIkAc@IkNqBKAKCwNsBMCMCcSsCQCQE_P{B[G[EkG}@wMmB_@Ga@G{K}AaFs@yRuDqAYmIgBKCa@K_EaAgMkD[I[I{JmCWIUG_AWo@QOEa@KaEiAUGWI_HiBuD_AEAMCSG{EkASEa@IcAWuGwAuGkAsHsAyEk@SCQC{KuAQCWCe@GiJo@i@Ei@E_F]mTs@_FAwEAc@?sDAW@W?gEFoBBqA@iDJS@U@G@sDLO?O@e@@Q@G@M?U@_Mr@iFV}G\\gADkBJc@BqDPe@Bc@BiDPY@y@Bc@@c@@M?kBD_FLI?yHAk@?E?c@?K?eDKy@Em@CMAC?EAC?kBIwEUSAUAOA_LoAgKmBSE_@K_@I{GaBoOcFoGuC_EkByDuB_@SCA{LgIeBiAiDsCcGaFiAgAQQOQaCaCa@e@o@u@s@{@SUQScCwCsAmBsBuCCCQ[mAkBu@oAIOKQ}@_BkCoFKQGO{AoD}@mCI]Ma@Mc@EMQw@c@qBe@wCESCSW_Be@_FUqEA[A[]kGM{GCq@Es@Eq@"},"start_location":{"lat":22.9995125,"lng":120.2484637},"travel_mode":"DRIVING"},{"distance":{"text":"94.0 公里","value":94037},"duration":{"text":"55分钟","value":3272},"end_location":{"lat":24.7547779,"lng":120.9529751},"html_instructions":"下<b>192-彰化系統<\/b>出口走<b>國道3號<\/b>，前往<b>大甲<\/b><div style=\"font-size:0.9em\">收费路段<\/div>","maneuver":"ramp-right","polyline":{"points":"ssarCkxw~UHq@AKGwAK{AQ}CC[IcAWoBAMGe@E]AGAMGa@Ic@G]ESEQ?CGQGUKSKQQYW]WSUQMGMGSEk@OICOCQAA?UCU?O?U@YBQDYFeBd@QFQDq@Rc@N]J[F]Fg@D]?qBFw@@o@@oA@YAoAMc@?WEuAg@IGi@YkAo@SISEQESEm@C[Aa@BU?s@NKB]P[Ru@t@SXKTUj@Mf@CZCTA\\?d@?@?R?^?DA|@CdB?DE^APOnAYrAI\\o@nBOb@CFAF?D?H@LQb@}B|FGLILiBzD}BhE_A~AKPKRuAtBCFEFKPGHIJu@fA}AvBINILeBxBwCdD{BhCyF|FcFrFaCpCiAlAoAdBOPGHGJq@x@W\\kCjD_IhKwAdB]`@}AhBWZ}BlCWZ}BlCqBzB}@z@eBxAGD_CxAID_Bt@}CzA_ElB_@P_@P}GdD_@P_HbDGDGBgE`CCB_@R]RYN_@P_@PqB~@i@XGBKDSJwAj@_CbAcHvC]LIDIDULcBx@oD~A}DhBEBGBIBsBz@s@XIBGB{@\\cBh@SDa@LgAZ_AR}@RE@[FYFYDUDYDYBaC`@oANeCPgAF}A?sA?uBB_@Cw@Cs@Ea@AuBGo@GYEI?OC}C[cGmAc@Ma@Ka@MgAYaDeAa@Q_@Q}DgBa@UiDmB[SaAq@mBwA}AuA}AwAACm@m@EGY]q@w@SS_CwCsAiBW[?AU[_CaDQUEGIMa@e@kBqBe@k@]_@}CkDQMOOMMMKYYMKs@o@IIKIMKMKMMcA_AsDcCUYSWaHuEMIOKOKKGIGuBwAoC{BSOGIIEy@s@gCmCq@y@i@m@IMU[KOKO]g@U[U[Yc@{AwCGIIOIQiAeCwAiDWu@iBeFOc@GQGOw@sBEMK]i@yAIUQa@K[CGa@cAEMMUQa@MYQa@CGu@}Am@mAw@wAU[EIGIMS]k@CEW[e@o@q@{@SUIKMOcCiCWWeA}@mAaAuAaAc@WkC{Am@[KGuAs@]OcAc@OGQIQG{@]SIAA]Mu@[gBs@qAe@sAg@yAk@g@Se@QkBy@QG_@QoB}@mAq@i@YoAw@?Ak@_@gA{@USEC[Ys@q@o@m@GG}AcBmAwAaAuAsAoBS[o@_AU]]g@i@cA{@iBGO_@{@c@uAm@sBO}@I]kAiFk@gDc@wCQ_BGe@AKKq@kAqIa@cCq@_DQu@Qw@Mg@Uy@c@yAUu@s@sBk@}AIQwB{EmBsDs@mAwAcCo@}@q@{@KQiCgDcBmB_@]OOGEGGkDcDmB{AsBcB}DkCwAcA]UsAaAKGiC_B}@g@QKKGGEg@W{DwBaDgB{EcCeAc@w@_@A?QIQIo@WuAm@e@Se@S_@QwAm@kBw@KC_@OoAc@QGQIgDeAa@McEsAcCu@OEME_EeAGAGCcGwAGCGAmCk@}A]oAYaASkAUy@QsAYcAS{@QSEMCc@IgB_@gCg@uA[yA]OEMCw@S{Bi@qA]{Ac@mBm@{Ag@mAc@IEKCi@SeAa@s@[QIMGs@[KEIEqAm@iAm@{@c@[QgAm@w@e@]SwD{B]UqAw@uHgEiCoA}@c@GEYKwDyAoA_@a@KuAc@uCq@iAUa@IiB]mDe@e@GiBMa@EK?{@GgAEgBKsDCwCBkHXiE\\]DaCZgBXoAXa@JE@yBj@wCx@wCz@q@RcA`@kBr@g@PiEbByChAw@Xs@Va@NIDm@RKDyAd@oCx@aAXa@JMBq@NA@}Bd@kCf@C?YFYD{BZcCViBNeAHc@Be@BiBJ_EH_DBQ?iCCgBCyDOy@Gc@CI?qBOoAIqCWEAc@EwC]WEeAOcBWEAeAQy@OKA[EmBe@E?]IcASc@KIAWGcAW_@KA?cAYc@MqCw@{@_@cGsB_A[}F_CiB{@OIOGu@_@cFqCMGMIwBoA}B_BCCYSqAaAuAaAwAmAcAs@cFwDAAYUiEcD[UsB}AkF}CsBoAoAg@iDoACAaD_ASEQGwBw@o@KQESCoG}@[EYC{@Ic@KcAKmAIwBIc@?E?i@@_GWQ?[CG?c@AqHe@kAKoD[mC[gCc@cBYYGkAYmBe@YKaEwAe@SiCmAo@]eAi@_Ak@WS]WmA}@aAw@uAgAIIeAcA_@[iAoAW[SS]e@W[o@y@CE}@wAo@iA}@cB{AwBsBmDKOW]}@wAW_@Wa@OUkAaB[e@Y]a@m@QWc@o@y@gAKMm@q@o@s@i@o@[YECUUKISU_@_@YYu@s@IIQOw@q@[W[YcAw@aCiBOKWOEEOKYQ_Ak@UQECQMMGoAu@]S]S_@U]S]SIEUKa@Q_@O_@OKE_@QaAa@_Bq@a@O_Aa@_@Qa@O_@OwEaBGCaAYsF_BUGSGiBk@UIUGyHyBMEKEICWMSGcBk@_@Oa@Ma@MGCWKgA]}Am@a@OYKEC_@Qg@SWMo@[o@[MGQI_@SIGSMyA_A]Ue@YUO_@S]Uc@WWQ]U]U]WKIMIe@]yEaEg@g@uBuBm@w@_BiBKMIIIKyCqDiCuDa@i@kBuCwAcCo@oAS_@Sa@S_@EIEIUe@k@iAmAsCqAsDQc@CKEKKWm@sBi@kBi@eBu@oCg@kCe@yBYsAUkAKe@aA_FIe@wAkHa@qBGa@I_@Ie@ESEQ_@gBEWCGc@mB]iAEOs@aCa@wAe@wAm@gBOa@MWEKUk@Se@M]iB_EGOaAmBaAiBOUIKGKoAsBk@{@OUEGeAwAaBuBY]W[W[Y[UUUWqGiG]U[WeA{@yAeAaC_BsBmASMSO_I{DgB}@uAk@_Bo@SIMGaC_AA?_@Oa@MaA_@o@UsGsBoAc@}@UeASiAQUEQCe@I_ASg@Ma@Iy@QyCo@qAYsCi@IAeASUGEA[Gi@KuCe@gB[OCSAeAM[EIA_BS_CYya@gFa@Ec@GSASCqB[QAGAYEcMqAMCMAeC[eJeAOCQEwKoAaEg@SCGA[EcAMgG}@kAQeBYcBWqGu@e@GqDYeAG}CWm@IC?wI}@eDa@yBY{AQUEUCUAy@Mc@EKAA?]EeGq@kGu@iC_@c@Ee@CkC_@mC]a@GyDg@_BSgGu@y@Ky@KoDa@w@IyBWoBW_@E_@EmC[iFm@EAOCGAE?UC}Ca@SEQCqHcAEAa@I_@IaDo@WGWGaIaBWEWGqBc@_D}@SGUGmBk@_FcBUIUIaC{@eEeBQIQGWMeG}CYSa@S_@QmEaCECAAEASMSMGEGCsAu@IEIEmFuCIEIGkEeCKGKGcDmBKGMIwA_AQKQKg@[SKQKw@e@kBaAMGMGoHsDWIUKmBs@MEMGaBm@YKSOSMcBk@yD}@m@MsDu@uDi@gDYa@EQAwDSoBE{@AmE@eBFoCL]B[B{@DgAHuCXcH|@i@JG@c@FiGlA}HbBiDx@E@MDSDyN`DiKbCwDt@uHfA}Db@uCVkBPuALcDLc@BmBHoBJkDJeA?c@@gA?g@?E?c@?K?wCCeBAM?UAgACaAE]Ac@Cm@Cc@ASAs@EKAK?WCsJq@KAa@GgH_A{AYaB]wD}@}Ac@sAa@i@QkDiA_DmASGQIk@SiAg@m@Yy@c@GE_Ai@a@WsBqASMcD}BqA_AIEGGSOGEmA}@{CsCeAgAc@c@c@g@m@q@[_@GKMOuEcGMOMOo@y@MQMOQWeA_BKQIOk@{@cAaBw@sAe@w@aB{CIOIMGOoAcCmAaCCG]o@IOQ_@m@iA_ByCMWGGmB{CyA{B_BeC{A}Bc@o@IMKOeBaCmBqBOQGIGG]_@GIOOMMcAgAcB}AoA_Aq@i@GCaAq@A?[UUO]Um@c@sA{@YQ[QWOe@U_@S_@Q]QA?_@SKGSIaBq@GCWKcA_@iAc@}@Yu@UyBi@sAW}A[cC]k@IYCy@I]E_@EkC]qJaAUEQAsEk@iCc@c@KGAa@Ik@O{@QSG{@Qm@Qi@M{Ae@{BaAOGoAi@sAy@{FmDeDuBUQ[UQMIIu@m@iBgBcAaAqAsAsB_CaBoBsAcB_@i@SYgHyIW]oDmE}AmBY[W]MOKKYYgG{GwAoAsE{DmAgAgBsA_CaBcCaBa@U[SA?[Sq@a@sEcCqBaA]Q]Q]Q}DiBcCiA_Ac@yBcAOGq@[o@[q@[yCwAyDqB{BuAaBiAy@i@i@_@KGcBgAu@i@gAy@y@q@_Ay@e@c@qBkBqBuB_@a@MMKKkAmAmD{DuEcFgBqBW[sC_DGGe@e@mCqCoAoAKMMKkBkB}@{@WUWUoBeBu@o@]W_Au@yC}BMKOKyAiA_Aq@_BeAOI]UcDsBGEcBaAcDcBYOEASKy@_@y@_@SIKEECuK_G_@S{A{@_@S_@S{BmA]SkAo@MGMGa@S]S]SaNoHKIIG]SeDwBgBmA]W}FcEQMOMq@g@gIyGuCmCWUCASSWWqGqGSUGEIIMM{A_BKKKKoCoCY[u@u@MMMMkGkGY[AAgB_Bw@q@w@o@MKIIGG]WOOKGIGiFsD}CiBaAi@e@Wc@U_@Sq@[i@UsEoBqBw@oAc@cDeAoBi@wA_@aDq@SESEq@Kq@McAQ{Ba@cBU{BWIAYEYEqAOuAQSEm@Km@IeAQc@GoDg@KAUEu@M}@OgAOWE_AOaCc@wA[yBe@uBo@}@[[O{Au@w@]iAm@mAs@mAo@uAy@oAy@WQGE[SgBoAaAu@MKUQUQoBeBi@e@iCiCo@s@OSCCUWqCgD{CqEmGsKa@}@Qa@Sa@}JaUo@wAo@uAeE{HsCqEeCgDOUMUy@eAoB{BuD{Dc@e@KK}CkCo@k@o@k@m@g@wAeAWUWSgBuAUQa@[[WmGuEkEaDy@m@]WSOMKo@i@}@y@cBgBaAaAOIe@]sAwA}BkCqCsDS]S_@i@w@iDiGe@eAQc@yBcF{@_C_@aAOYMWOc@AEOe@Uo@gBsF}@oCQa@GSYu@e@uAo@iBOc@Oa@Oc@?AOc@}CoHQc@Qa@Yq@?A[m@aAoBIMGKi@aAm@gAs@eAIOKOCGU[SWOUMOIMIIGGSUMMEEQYIKIKmBcCcAcAuAsAoAiACCWY}@u@q@g@[U[WwA}@qA{@CCWOIEIC]USKIGuAs@_CgAGCOGMEICUIkBs@_@OaBm@eFwASAQCgBa@KCWESGSGqB]_AMOEIAYGwASc@GMCMEeAQa@G?A{@MaBS{Fi@wAQ_BI_CWsB]gCa@]EqDo@UEWGKCIA}A_@yAa@gDaAcBs@o@[{@c@[M]MWKwBaAgD_B}EoCKIQK{@i@MIgDaCuAgAgCsBcA{@OO_@_@[[a@_@USc@c@k@]{@eA{DuDoAoA_AaAg@k@Y]GGEIyDqEo@s@KOGGEEUW]a@qFyGW[Y]mCeD}CoDcDuDUWUWcE_EiJ_KcOmPsIkJ}OcQOQECUU[[[YiE}DyEuD[WA?g@]QM[U}B{AcEeCc@S_@QkEsBwF{BYIWIuEaB[KUGEA]I}@S{@S{@SwDo@WCc@GoBWgCWE?MCc@Ea@EaBIcBKsCGsCI}BE}IHK?wABoIT_@?wEDgAAc@?c@?c@?MAq@?A?c@E_BQeAMGAq@I{@I_AKQEQCa@Gi@KMC{@MiB_@qA[yAc@ICQGMEC?gBm@cBo@a@O}@a@iAg@c@SQKSKGE_@UeAk@oAw@eC_BkBoAqCoBmByAWSCCw@q@kA_AuCcCiB}AuBqBgC_CkDoDoF_GoB_CsBkCqAgBGI_AsA}@uA]m@U_@U_@S[Ua@U_@k@cAy@aBEMGKc@w@CIQa@c@cAQa@c@cA]w@mBuFQe@Ma@ACOa@Ok@oAsDYmAMc@yDoMI[KYe@iBcAqDcAkDcAmDAEK[]aAAC[gAM]K[u@{CW{@W}@sAuEOc@i@mBYaA[aAkEkOMc@uE_PK[KYu@mBY{@EMGK}@eCi@wAIOGQGSWm@Wk@u@gBGQ_@u@y@cB}AuCkAwBeAkBIMIMuBcDQYw@iAgAyAoBcCKOMMm@q@u@_Aa@g@[[e@e@sAqA}A}AiDyCgB{AWQ{@u@ECUSiA{@cDaCqBuAA?[U]UCAYSCA{@i@yBqA[QcAm@WO_@QAA]Q}Ay@MGq@]YMEC]QYO_Bs@g@UsCoAmFaC_@Oa@Q_Ac@sFcCkDeBgAk@}Ay@wAy@u@e@qBsAg@]uBgBwE}DQQkAoAi@k@c@e@cAkAQQ}AqBsAqBu@gA[g@GKgAeBIO[m@Q]KSKScBmD]_AsAqDQc@GQYu@Um@ACw@wBWw@m@iBeAeDkAcDCIg@wAEIM]M[M[gBoEs@cBSe@U_@o@kA_@o@cAgBe@w@_@i@g@u@[_@y@eAc@g@_@c@]c@GGkBoBSUUWWY_A{@UOQOmA_A}AoAuD{C]U{AoAaAu@]W}@u@uAaAkBsAe@]q@o@u@m@w@s@UQk@m@kAsA{@aA}@iAo@}@QYs@eAa@o@y@uAs@yAYm@GQ_@y@CIc@eAM[Sk@q@uB[kAq@kCi@mCGc@Ig@Ko@S}AEc@Ea@OyBKgBC{AAm@E{D?GAw@?_A?eB@qABkBDcBHuF@aEAaF?i@AmA?e@?AGyBAyAGcAOoBE_@E]AIKs@AMAMKu@Gg@y@sE]wAKg@eAqEiAiE_@wA"},"start_location":{"lat":24.0980209,"lng":120.5493356},"travel_mode":"DRIVING"},{"distance":{"text":"2.8 公里","value":2810},"duration":{"text":"2分钟","value":105},"end_location":{"lat":24.7579489,"lng":120.9795919},"html_instructions":"靠<b>左<\/b>继续沿<b>國道3號<\/b>行驶<div style=\"font-size:0.9em\">收费路段<\/div>","maneuver":"keep-left","polyline":{"points":"k|avCcsfaV{@kB{HuQOa@Um@Wk@M[}@iCa@oAcAkDg@oBUgAOs@UaBGa@c@aEMcAEa@AIEe@Gs@KmAI{ACy@EiACs@A}AAaA?UDqCBi@@e@Ba@Be@@M@i@F{@H}@Dm@Da@De@Fe@Fg@BUBQBUBMJy@Fg@Hg@Fc@Fg@Hg@Hg@Ju@Nw@Fg@Fe@Jg@Fc@Hc@D]D_@D_@BY@IDm@Fm@@c@Bi@@Q@SBe@@g@?K?Y@g@?w@?k@Ag@?AAw@?GAq@Cm@Aq@Ao@Ai@Cg@Cq@Em@Em@Gc@Gy@Y_DG{@"},"start_location":{"lat":24.7547779,"lng":120.9529751},"travel_mode":"DRIVING"},{"distance":{"text":"80.0 公里","value":79982},"duration":{"text":"51分钟","value":3056},"end_location":{"lat":24.9945399,"lng":121.5935439},"html_instructions":"靠<b>左<\/b>继续沿<b>國道3號<\/b>行驶<div style=\"font-size:0.9em\">收费路段<\/div>","maneuver":"keep-left","polyline":{"points":"epbvCmykaV_@sCMsAIoACg@A]Cq@A}@AgBAyAD{AJ}BDg@Dg@Fw@XcCPkAb@}B^iBJe@Py@J]@EFWDQDOBMLe@Lc@Lc@Pu@^yAn@eCd@uBVoAN}@Lo@f@uDViCX}EDiI?UAQ?ECy@CWAO?GOkBc@sDQcA]yBq@oEIo@_@qCYeBEe@Ge@Ga@Ek@MkAOsB?AEoACg@E{@CwC@uB@_A@o@@o@NwCReCL{A?Ef@eE`@sB^aBFYBKHe@F[XsAzB_JJe@VgA\\aB`@qBf@oCDSFc@Jy@RgBL}ADe@NiBLoCBeBBcAB_A?_BCmAAc@?CIuBAOAWI_BEk@Gu@Im@E[Gg@?CGa@Gg@Ic@Ic@Ke@Kk@AIKg@]sAMk@YgAMe@k@mBWs@Oa@a@eAQe@a@aA[u@aAmBYk@g@{@Ya@sAcBw@kAeAwAeBqBi@u@CEe@m@SUoAsAWYq@}@s@{@w@gAiAiBeAaBmBwDS_@MY}@cC{@yCMe@Y_AUgAU}@a@yBk@mEE[QgDAOEk@AyAA{CB{BFwBHkABk@D}@JqAF]^wCNaAJq@`@qBHc@ZqARq@x@kCx@aCN]Ra@x@gBpGcMR_@Te@b@}@DIxAyChAmCpAaD`@sAnAgEFQLc@@Ct@wDLi@L{@Ny@RsAf@uE`@gGDg@Be@@a@D_D@E?oB?Q?[?gACyAAc@Cg@EmA?KA[KgBEu@Ee@CUUwBcAkHeBqH_BmFISCKKSEMCGMYq@}AO]O[Qa@Ui@g@kAOYCGKSaBcDwByDQUU_@U_@oBaDSWQYMQa@i@OSOSq@_AKOAAMQ}DmEQSQQwCkC][KMcBaBaAq@cDqC]WQOaBoAmC}BqBcBo@k@IGGIQOg@_@_HgGm@m@WWAAUUuDuDcBoBqBiCkBeC[a@_@i@iDmFmAuBg@aAIUIUACa@aAq@wAo@wASk@Uk@EOGOmAoD_@iAm@gBy@mCc@yA]qAOm@EUCSAAe@yB_@gBO_Ae@mCEYAOCOM_AOgAGk@Go@Iu@MkA[_EG_AC[IuAG_BGgBK}CAgAGaC?]EaBA{@CiA?g@AS?}@AmDA}CAkDAI?g@GgCEsCKmCEy@]yDEe@AAOqAOeAIe@_@iCYuAOi@Mc@I]Ok@Mc@EQGQ[aAAEOc@KYm@}A[u@AAQ_@a@}@y@}Au@sAc@u@GIOSW]m@{@KMm@q@eAsAqBuBaA}@q@m@oByAWOKGKI_@Si@[{A}@mAm@eCkA_@Q[QUIUKmAe@aAc@uCiAa@O]MwCmAqCiAiBw@mAi@iAi@i@UgAg@aAe@QKMIQIQIuAw@mAq@aCwAk@_@]Uq@c@s@g@_@YSOQOkA{@{@s@mA_AqAiA_Aw@cA}@c@c@SSKIOMQM_CkCwAaBEGGIIKU_@W[MQgAaBi@w@ACS[GKkDoFi@y@Ya@KSKSOYoBwD]s@i@gACIKUMUu@aB}BeGkAqDKc@KWEKCKi@gBMe@Uw@W_Aa@mB_@aBEQ]eBScA]}BWaB?EQiAAKQoBU}Bc@yDIq@KeAGy@Ew@Cg@AK?IOcDIgDAgAAUEaCAaD?wCBiADcCPeFJeBB]B]@MZcEHy@R_CZoCJq@DWDW\\iCx@_FbAaFt@yCb@{ABKLc@@Cn@}Bj@aBlAkDrCgHJWFOzEcKrAkCh@_AP[P[bMyUxEcKdA}CNe@VgAFWFYBKBK|@wD\\kBFa@N}@PcAD_@BUBYLwADo@@]?E?a@?A?u@@W?m@?W@o@@_@?ADW@OPyA?e@?g@?}@KmEAe@IoACe@SqCUqBGg@KaACIGe@EYSoAg@aC]yAI[CIQm@w@eC?AOa@c@oAk@uAqAiC}@cBkAgBoAmB{EkG{FcFGGWSw@o@u@c@IGuAw@yDmBcGcCoA]sBe@kBa@mB[KCa@GmC_@eAKc@Ec@EeAKc@GG?[Cc@Cc@C]AGAa@C[CaAGC?oCG_@AC?c@@c@?c@?c@@c@?c@BeADe@BS@c@@S@O@oDF_EHmEPoCDc@@c@@wMV}JXU@S?[@yLXa@?c@@uINgKR}B@kKRc@@c@@c@?{MVyBB_@@iK\\uEHaJHgABkDFQ?c@AmD?g@Ec@Cc@Ec@Cc@Cc@CAAuCYYCa@GQAwASc@GOCQEkCi@OC{DeAICWIsC_AsAi@aA]mAk@oBeAsBgAg@[}@i@g@YgCkBc@[kD_DMMQQQSGGY[_BcBoA}AQSCCSWeA}AoAeBCCU_@wA}BGMKQS_@U_@a@u@qAqCc@}@gBwEEMM[Ug@EKgBuEc@{AQg@MYgBwEUy@GUGSqAaFI]YqAIYGYU{Ag@wCGg@?AIg@?AQ}@Kk@Ia@SeASeAW{@GYKs@GUCUES}@iGeAsHKm@Kk@gAmH_BiKEUEUGa@G_@mBaJ[mACMEM_CeIeBcFyAmDsCeGQ_@MUoEeHyDcF_@a@YYWYiHeHKIKI{N}Ma@]YUYWYUcC{B_B}AuCkDiEyFgC_EcCoEiFsMkFePOg@Qe@eFcMKUMUq@sAuCkFeFyGIMKMEGwBcCkE{D{@s@MIKIsAcA}E{CsBiAqDmBaCaA[M[M}K}DiA_@a@O_@OsPgGe@QoFeCCAqCwAKG_@QmAq@sA{@MKOKkAu@_E_DkCwBgC}Bs@q@YY_A}@uBgC_BqBU[aDkEgBmCgAgB_BsCc@aASc@[q@Yu@_@cAa@iAo@gBgAiE}@oEUoBKu@OqAIw@UyBQeBKqA}@qKQyBk@_E}@gEo@aCMc@qBaFc@w@O]Q[M[mAyBcAuAi@o@aBoBcB{AcCuBkBmAQKaEsBaGgCsKoEs@]aDaBkD{B{@k@KMo@e@m@g@SQwCyCsB}BaCgDyAmCuAoCcA}Bu@iB{@{B_A}BeC{G{@uBoAaDaCiFEIQ]S]k@gAKOwA_CmD}Es@w@IKIIkB{ByDsDe@]KIKIeCyBOKMKc@_@qB_BcCoBIIwAoAQOQM[YOMKIu@s@CAs@o@UUwAsAmAiAk@m@GEIKKKgBuBIIEIGG{BgDy@gA}AsC{@eBEKGKMYo@}Ai@yAUk@Wu@[eAa@yAIW]wAG[Ke@]mBQaAIa@Gc@[{CESEa@KcA?MKqAEw@Es@Ce@?u@EiB?iA?gABy@@a@FsABg@@W?GXeEh@kFFc@BQBOHg@@Mf@cDFa@Ji@Hg@Jg@pAcG|@wDnDiNvA{FFSFQ`@cBh@wBr@aDh@_Df@wCN{@t@yEJw@Fm@@CTkCL}BNgDBuB?c@?i@?g@@g@?qBEkBG_A?QAQSuCO_BMcAAKWyAw@cEU}@Om@Su@Mc@AAKa@Mc@Sm@Qo@Uq@KUEKEGk@{Ao@qAa@w@kA}Bi@y@wAqBqAeBi@m@W]A?_@g@SWoA{AY[_AkA}@aAOOmCwCq@q@QQOOQQOOo@q@SSoAqAqAsAWWWWOQQQQQUY{FmGMQOUGGIK{AoBgEqGwFmKKSMYmBsEsBsFISGSo@eBaBaGGUGSGQ}AwFy@kDESEMCOy@oE[uB_@aCKy@Ge@Ik@KgACOAMCOWoEOaCCgAAI?IMgCMoEC_G@a@?sD?O@O@yB?IBoADkBJeEL_F@a@@c@~@oUFwAfAkWBu@?I?A@WF_B@e@F}A?O@MDmAJqC?K@I@_@L{DDwAXiFBk@@[@K^aJ?QDaABe@@c@BiABuB?kB?yA?SCwAIiBM}AU}BSmAKm@Mk@[yA_@sAc@uAs@kB}@mB{@yAOWU_@W]_AmAaAgA_C_CwAmA_BqAcDmCKIKIu@k@{@}@UWSWw@w@cByBiBoCU[w@uAKQKQEGg@eAKW_@iA_@eAa@sAg@{BYaBUaBIi@MkAGu@E_@Ca@A]q@kIC]C]{@{L_@kCIc@Gc@Ks@[cBCKg@wBm@mCCGK_@Og@g@sAu@mB[u@IQIQiBgEuAcCaA}AiAiBOQQWAAU[Ya@s@{@qAwAWWUWUUa@_@{AkA{AmAuAcAKKMIWSwCeBWMQKSKuMyG_EeCWQSMcBoA}ByB[WWYY[?AsAaBcA_Bw@}AWi@qAeDq@_C[oA[kBUyA]sDCm@Ag@Ce@?qB?gB?W?Y?SByGPoI@m@?]?]B{AGmC?CE}@E{@SoBKgACUCUIgA_@_C]qA]sAACEOEQOg@g@iBeAgCoBoDoAwBmB_Dg@q@MOMQg@q@cEuFIKIK[e@KKa@i@c@i@_LaN}ByCmCqDi@s@MO_AoAQUq@aAYc@k@{@Yc@Ya@s@cAw@kAGKu@aAaAuAmAgB_AuA_AwAEG[o@a@{@_@{@i@mAQc@Qe@IUEOMc@U{@SmAS_ASkAWoBCWEw@G{@Co@Ao@?EAiA@q@B_BBiADu@HgALgA@GHw@Hg@?EHi@Jm@RcAJe@XcAPk@Le@Lc@HSZy@Zu@b@aABGRc@h@kALUR_@f@w@f@q@^g@`@k@b@e@r@{@\\e@\\c@bG}G`BiBX[fCqC`FuGdCgDd@q@V]T]V_@NWx@uAd@{@b@aA@Af@kAHS^{@p@kB^kAVy@ZgAl@kCNm@DUVuATuAV{A@QBQBOHq@LmAR}BJsAPmC@[Dy@HuC@}B?}A?o@K}CKwDEwC@yCHcCFgBJkCPqBNqA@EHm@@EXeBR{@@CVaABKDMZiA\\_AJ[JYXw@zCwFRWJQLOp@aA`CqCv@s@tDgD`Aw@lBcBrBcBf@c@pI}GxD}C|VgS`FeEn@k@ZWDE`JqHFGZWdB}AFGZYPQZWj@o@n@s@b@g@d@o@l@_A`@s@Zi@Xk@^}@L_@Tm@Nk@^uARaAJo@NkAJy@Fw@@OHuA?gA?iA?[A[?[?AA]AOASASEm@?AEe@AKQ_ACSg@sCsAsDa@eAmEuHsBoBmAeAm@c@m@c@qAmAkGkEcSkNyB}AyAeA[SyAeAg@]mA_AYSAAwAgAsB}AMIuAgAk@e@OOsAiAyBkBgAeA_A}@w@{@k@m@Y]AAm@u@Y]eAwAe@q@s@iAIMg@{@IOKOu@uAO[MUcA{BYs@Q_@e@mAEIGQGQGQGQGQ_@mAa@_BWaAIc@Kg@Ia@AIEWG]G_@Iy@Ge@?AE[Eo@IiAEy@Co@As@Ag@?g@?_@?a@@o@Bq@@U@e@Bc@De@Di@JoARaBB[NeAR_B`@{CHo@BOBOFc@LkA?ANkAH{@Hw@Fm@B_@Bc@Ba@Dq@Dm@Bi@@W?UFeCBaA@cB@i@Ae@Cs@?m@EiCAe@Ew@Cg@Aa@Ew@M{AUsBe@aEMmAGg@C[CIQkAWcB{BoIi@iBOg@Oe@i@{ASg@Sg@Sg@Sg@u@}Ae@aASa@_@y@aAcBWe@_@m@_@o@AAW][e@wAmBmA{AkAwAc@a@m@k@aC}BGIo@m@i@e@e@]cBmAkCeB]S}@i@sBkAGC_Ae@_Ac@_@QcAg@{@]gAc@[KcBm@s@Wo@Qa@Mo@OQEwCq@gAWUGKAa@KeAU_@Ge@GMC_BQaAOc@GeAOc@Ga@Gc@Gy@KQCEA_AMeDc@"},"start_location":{"lat":24.7579489,"lng":120.9795919},"travel_mode":"DRIVING"},{"distance":{"text":"1.7 公里","value":1681},"duration":{"text":"1分钟","value":88},"end_location":{"lat":25.0028083,"lng":121.5905135},"html_instructions":"下<b>20-木柵<\/b>出口，前往<b>木柵<\/b>/<wbr/><b>台北<\/b><div style=\"font-size:0.9em\">收费路段<\/div>","maneuver":"ramp-right","polyline":{"points":"{vpwCsvceVGICCCAGEUEGAIC[G]GQG]Kw@[GCGCMEo@]IEIEIGMIKIOKMISOKIKKIIKIGGOOQSOMSUWY[]UWMOKIOOIIYWAA[W]WQKKIe@YOISKa@S[MMGGC]M_@MGCQEOGEAQEE?C?CAKAICKAOCWEWCUCQCGAG?OAO?KAQ?W?W@Q@S@Q@]FSDOBIBOFUJWLULUPA@OJIHEDEDIJKLGFEHEFCBKPEHKRGLABA@ABGPADGNGRCLEJAFAH?@CRCPCf@A\\?N?P@V@X@TBR?@BV@BBTBJ@JNz@VnAJd@F\\@DDRBP@HBNBNBVBV@L@J?@@R@P@R?T?N?d@Al@ANAVAFAJE\\?FAF?H?R"},"start_location":{"lat":24.9945399,"lng":121.5935439},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 公里","value":588},"duration":{"text":"1分钟","value":29},"end_location":{"lat":25.004145,"lng":121.5848747},"html_instructions":"走<b>國道3甲<\/b><div style=\"font-size:0.9em\">收费路段<\/div>","maneuver":"merge","polyline":{"points":"qjrwCucceVIj@Mp@kAhHo@rDq@dEAJCLk@rEGl@E`@ATAP"},"start_location":{"lat":25.0028083,"lng":121.5905135},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 公里","value":567},"duration":{"text":"1分钟","value":33},"end_location":{"lat":25.0069523,"lng":121.5813902},"html_instructions":"下<b>3-萬芳<\/b>出口，前往<b>信義路<\/b><div style=\"font-size:0.9em\">收费路段<\/div>","maneuver":"ramp-right","polyline":{"points":"{rrwCm`beVKTAF?BANI~@KjAGl@AJAPKtB?PAH?JA@CD?BAB?F?B?DCNALENAJCFEJCJCDCFEHEFEHGHEDGFEDGDMJA?GDKFGBA@MDQFUDUDUDE?MBM@G?I@Y@c@@G?]?a@CSAOAGAG?QB"},"start_location":{"lat":25.004145,"lng":121.5848747},"travel_mode":"DRIVING"},{"distance":{"text":"3.0 公里","value":3020},"duration":{"text":"3分钟","value":209},"end_location":{"lat":25.0319919,"lng":121.5718269},"html_instructions":"走<b>信義快速道路<\/b>","maneuver":"merge","polyline":{"points":"mdswCujaeVs@Gc@EWA{AK}@Ee@AkAGw@CsFAc@AE?eDBoADo@@W@c@BqAHsAJc@DuANcALG@cC\\I@{@Pu@Pq@Lc@J_@HeAVyA`@qAd@}@ZcA\\_@LA@_A^i@Tu@\\g@Tw@`@]P}Az@_@RMHsBhAuAx@qAp@UL{@d@qAr@[P]P]RWNe@VUL}@f@KF]R_@POFmAp@{DvB{Az@yF|CYPc@T_@R{BlA_@RaFlC[ROFwAx@mAb@[Jy@PmANI?aBNW@"},"start_location":{"lat":25.0069523,"lng":121.5813902},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 公里","value":163},"duration":{"text":"1分钟","value":15},"end_location":{"lat":25.0329333,"lng":121.570835},"html_instructions":"下<b>左侧<\/b>出口，前往<b>基隆路<\/b>/<wbr/><b>市政中心<\/b>","maneuver":"ramp-left","polyline":{"points":"}`xwC}n_eVg@HYDC?G@G@E@GBG@CBC@EBC@GFEDCDCBADCBCFABADADAFCJCRA`@AHAB?BCBCD"},"start_location":{"lat":25.0319919,"lng":121.5718269},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 公里","value":246},"duration":{"text":"1分钟","value":45},"end_location":{"lat":25.0328975,"lng":121.5683962},"html_instructions":"走<b>信義路五段<\/b>","maneuver":"merge","polyline":{"points":"yfxwCuh_eVAZJfEC`G"},"start_location":{"lat":25.0329333,"lng":121.570835},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 公里","value":302},"duration":{"text":"1分钟","value":68},"end_location":{"lat":25.0329662,"lng":121.5654019},"html_instructions":"继续沿<b>信義路五段<\/b>直行","maneuver":"straight","polyline":{"points":"sfxwCoy~dV?\\CbFAzACfCCpA?^"},"start_location":{"lat":25.0328975,"lng":121.5683962},"travel_mode":"DRIVING"}],"traffic_speed_entry":[],"via_waypoint":[]}]
         * overview_polyline : {"points":"kckkCwyx|UhGqkA]q`@BiPpFcBmDyB{c@n@aoAiNeaBdE_kB}RihCOm_Ev[yqCns@g}@h\\{hB`[m}B{RoeCsNipBuF}_Cqn@uvCopAku@oX}hAku@{cAwu@igAkf@{~Ay~@mv@m[upA{z@{o@yz@c{A{dCylAiy@kx@uT{|@sF}oBtCyrB{SuyBghA{u@{\\oeC{f@wnAso@{k@}g@afA_m@syAyMovBsj@kiCot@caDolAskEwf@wuBe_@{w@wVqwAom@_iBoaAkvAqk@ua@iImlA}DwsBn_@giBhTypBmQo~DejAyhCyPilBdEaxBsPg_E{f@y~AqZuvAtAsdAwOerBwb@e~AaBasBiDifD{e@}uCym@ccAuNgjAg@kwAdE}j@mGu{@{_@cXsU{Ywc@iKwi@eHku@ia@dAuOmCiEtKyZvw@czAd_BylAdk@{w@xIog@_Pc[y\\yn@ui@k`@_t@kb@yg@io@i[qU}_@eMos@a\\el@ga@{YgiA_c@o`AgVwlA}c@my@~Hib@`OwpAr@abA__@uo@ib@ib@yGeo@kGm]mS}e@gq@ayAiq@kh@w]mi@mlA}ZgdA{aAgt@cjEkn@wfByS_nAgYcs@u`@_b@mPau@sA{bC|ZmhAySyp@cr@}i@e{@gm@uY_i@aH_b@cSiwAusAkoAq|@_~@eu@uuAc|@sw@sr@qgAyWyb@aMwZcVyr@}nA__@g]ag@gd@iQq_@q\\sw@gc@}]kr@qN{h@qKme@qYexAw~Aox@au@kf@{OarAwCau@i]kn@yq@eN_[gl@qqB{e@o|@_r@cg@io@g[u]k`@sb@wcAiu@yq@}O{[cEaf@Sir@gUaw@cLqbAlFkc@sB_p@bLe~@cEcxAlQkvAkKap@sVs]mTol@rBqj@fZyr@xGiiAy`@qaA}dAscAk]gdA{EovAcVkn@_~@ye@}m@ii@k`@adA_AezAry@g|BdAqs@wHc[cXo]oYiM_XeDoSEyjD~Gg|@qSgk@e|@oTeeAkYegAcw@_z@ws@_yAut@kb@kw@ub@{]qi@}O}cAaKoR_h@gZoh@wm@q^ar@cn@ql@iSg}@d[aiBmEaaA}h@es@q`@cm@mQ}q@~@}{BbB{lAsUyc@iXmZ}UwsA}R{Z}i@c]gTqh@Fmj@oK}b@{g@_r@i`@sv@hIeo@ps@efAbHavAxLmZbrA_hAlPeTrCmXyQec@sv@oj@gd@km@iDyi@pE{w@gX_dAi`@m]w[{Kmb@wHw_@qSoL~F^xRuIvaAqbA|F{iBtx@wAhf@"}
         * summary : 國道一號和國道3號
         * warnings : []
         * waypoint_order : []
         */

        private BoundsBean bounds;
        private String copyrights;
        private OverviewPolylineBean overview_polyline;
        private String summary;
        private List<LegsBean> legs;
        private List<?> warnings;
        private List<?> waypoint_order;

        public BoundsBean getBounds() {
            return bounds;
        }

        public void setBounds(BoundsBean bounds) {
            this.bounds = bounds;
        }

        public String getCopyrights() {
            return copyrights;
        }

        public void setCopyrights(String copyrights) {
            this.copyrights = copyrights;
        }

        public OverviewPolylineBean getOverview_polyline() {
            return overview_polyline;
        }

        public void setOverview_polyline(OverviewPolylineBean overview_polyline) {
            this.overview_polyline = overview_polyline;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public List<LegsBean> getLegs() {
            return legs;
        }

        public void setLegs(List<LegsBean> legs) {
            this.legs = legs;
        }

        public List<?> getWarnings() {
            return warnings;
        }

        public void setWarnings(List<?> warnings) {
            this.warnings = warnings;
        }

        public List<?> getWaypoint_order() {
            return waypoint_order;
        }

        public void setWaypoint_order(List<?> waypoint_order) {
            this.waypoint_order = waypoint_order;
        }

        public static class BoundsBean {
            /**
             * northeast : {"lat":25.0329662,"lng":121.5973157}
             * southwest : {"lat":22.9973255,"lng":120.2269966}
             */

            private NortheastBean northeast;
            private SouthwestBean southwest;

            public NortheastBean getNortheast() {
                return northeast;
            }

            public void setNortheast(NortheastBean northeast) {
                this.northeast = northeast;
            }

            public SouthwestBean getSouthwest() {
                return southwest;
            }

            public void setSouthwest(SouthwestBean southwest) {
                this.southwest = southwest;
            }

            public static class NortheastBean {
                /**
                 * lat : 25.0329662
                 * lng : 121.5973157
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class SouthwestBean {
                /**
                 * lat : 22.9973255
                 * lng : 120.2269966
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }
        }

        public static class OverviewPolylineBean {
            /**
             * points : kckkCwyx|UhGqkA]q`@BiPpFcBmDyB{c@n@aoAiNeaBdE_kB}RihCOm_Ev[yqCns@g}@h\{hB`[m}B{RoeCsNipBuF}_Cqn@uvCopAku@oX}hAku@{cAwu@igAkf@{~Ay~@mv@m[upA{z@{o@yz@c{A{dCylAiy@kx@uT{|@sF}oBtCyrB{SuyBghA{u@{\oeC{f@wnAso@{k@}g@afA_m@syAyMovBsj@kiCot@caDolAskEwf@wuBe_@{w@wVqwAom@_iBoaAkvAqk@ua@iImlA}DwsBn_@giBhTypBmQo~DejAyhCyPilBdEaxBsPg_E{f@y~AqZuvAtAsdAwOerBwb@e~AaBasBiDifD{e@}uCym@ccAuNgjAg@kwAdE}j@mGu{@{_@cXsU{Ywc@iKwi@eHku@ia@dAuOmCiEtKyZvw@czAd_BylAdk@{w@xIog@_Pc[y\yn@ui@k`@_t@kb@yg@io@i[qU}_@eMos@a\el@ga@{YgiA_c@o`AgVwlA}c@my@~Hib@`OwpAr@abA__@uo@ib@ib@yGeo@kGm]mS}e@gq@ayAiq@kh@w]mi@mlA}ZgdA{aAgt@cjEkn@wfByS_nAgYcs@u`@_b@mPau@sA{bC|ZmhAySyp@cr@}i@e{@gm@uY_i@aH_b@cSiwAusAkoAq|@_~@eu@uuAc|@sw@sr@qgAyWyb@aMwZcVyr@}nA__@g]ag@gd@iQq_@q\sw@gc@}]kr@qN{h@qKme@qYexAw~Aox@au@kf@{OarAwCau@i]kn@yq@eN_[gl@qqB{e@o|@_r@cg@io@g[u]k`@sb@wcAiu@yq@}O{[cEaf@Sir@gUaw@cLqbAlFkc@sB_p@bLe~@cEcxAlQkvAkKap@sVs]mTol@rBqj@fZyr@xGiiAy`@qaA}dAscAk]gdA{EovAcVkn@_~@ye@}m@ii@k`@adA_AezAry@g|BdAqs@wHc[cXo]oYiM_XeDoSEyjD~Gg|@qSgk@e|@oTeeAkYegAcw@_z@ws@_yAut@kb@kw@ub@{]qi@}O}cAaKoR_h@gZoh@wm@q^ar@cn@ql@iSg}@d[aiBmEaaA}h@es@q`@cm@mQ}q@~@}{BbB{lAsUyc@iXmZ}UwsA}R{Z}i@c]gTqh@Fmj@oK}b@{g@_r@i`@sv@hIeo@ps@efAbHavAxLmZbrA_hAlPeTrCmXyQec@sv@oj@gd@km@iDyi@pE{w@gX_dAi`@m]w[{Kmb@wHw_@qSoL~F^xRuIvaAqbA|F{iBtx@wAhf@
             */

            private String points;

            public String getPoints() {
                return points;
            }

            public void setPoints(String points) {
                this.points = points;
            }
        }

        public static class LegsBean {
            /**
             * distance : {"text":"318 公里","value":317580}
             * duration : {"text":"3 小时 22 分钟","value":12114}
             * end_address : 台湾台北市
             * end_location : {"lat":25.0329662,"lng":121.5654019}
             * start_address : 台湾台南市东区台南
             * start_location : {"lat":22.9997357,"lng":120.2269966}
             * steps : [{"distance":{"text":"37 米","value":37},"duration":{"text":"1分钟","value":7},"end_location":{"lat":23.0000545,"lng":120.227089},"html_instructions":"从<b>小東路198巷6弄<\/b>向<b>北<\/b>行驶，到<b>小東路<\/b>/<wbr/><b>180縣道<\/b>","polyline":{"points":"kckkCwyx|U}@Q"},"start_location":{"lat":22.9997357,"lng":120.2269966},"travel_mode":"DRIVING"},{"distance":{"text":"1.3 公里","value":1348},"duration":{"text":"4分钟","value":262},"end_location":{"lat":22.9984355,"lng":120.2399823},"html_instructions":"向<b>右<\/b>转，进入<b>小東路<\/b>/<wbr/><b>180縣道<\/b>","maneuver":"turn-right","polyline":{"points":"iekkCizx|U\\cBJg@DUV}@dAiFh@_C\\eBPaAJi@TaAPaA@K@QJeCBg@Bi@Be@B[DcARgEAYEsD?mA?mA?{C?YAoA?cA@wCAYCu@?e@EkB"},"start_location":{"lat":23.0000545,"lng":120.227089},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 公里","value":813},"duration":{"text":"2分钟","value":113},"end_location":{"lat":22.9985328,"lng":120.2479188},"html_instructions":"继续直行进入<b>復興路<\/b>/<wbr/><b>180縣道<\/b>","maneuver":"straight","polyline":{"points":"g{jkC{j{|UEcAEm@?AEcAIeA@mB?k@?I@kB?g@?O@uB?uDAm@Aq@?k@@oB@wB?e@@iA?_B?SA_@BiA"},"start_location":{"lat":22.9984355,"lng":120.2399823},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 公里","value":155},"duration":{"text":"1分钟","value":25},"end_location":{"lat":22.9971398,"lng":120.2478922},"html_instructions":"向<b>右<\/b>转","maneuver":"turn-right","polyline":{"points":"y{jkCo|||Ud@?\\?P?n@?L?zADd@?"},"start_location":{"lat":22.9985328,"lng":120.2479188},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 公里","value":343},"duration":{"text":"1分钟","value":79},"end_location":{"lat":22.9995125,"lng":120.2484637},"html_instructions":"在<b>的第 1 个交叉路口向<\/b>左<b>復興路71巷<\/b>转","maneuver":"turn-left","polyline":{"points":"csjkCi|||UXS@C?A@O?UAM?OAG?CAAEEECKEsE@aA@I?M@kDB"},"start_location":{"lat":22.9971398,"lng":120.2478922},"travel_mode":"DRIVING"},{"distance":{"text":"131 公里","value":131488},"duration":{"text":"1 小时 18 分钟","value":4708},"end_location":{"lat":24.0980209,"lng":120.5493356},"html_instructions":"走<b>左侧<\/b>匝道，走<b>國道一號<\/b>/<wbr/><b>國道1號<\/b><div style=\"font-size:0.9em\">收费路段<\/div>","maneuver":"ramp-left","polyline":{"points":"}akkC{_}|UKDKBY@cDBQ?yA@gA@O?aDFiDFyA@uA@I@C@IFuII}CI}CQ}AMw@Ic@EkCYEAcBUc@GoDk@qDo@gE}@gCk@{@O]G]G}Co@iBYMCYG[EcAQUEe@GcAKiAIq@Eq@C}BEs@Ai@@[?iADy@DgAJo@HE?]FyKdB[F[DeDf@eCX_@B_@BiCVyFVi@@c@?[?Y@yFBwNYcBKq@Co@EmBM}AKeHs@yC[cFi@e@G_@EWCeBSKAeAOk@GEAa@EqLsAeIgAg@G_@C]EiHq@SCQAkEg@iJkAm@GsBUQCSA_CWqBOE?_@Cg@CeCMUCSAwJm@e@AWCWAkOYo@?g@@e@?}E?O?Q?cNES?S?qE?yA?S?U?kFBc@?iKFoGHu@@_@@_@?_LLgJJoCHiBHc@@qDLcBHoCH}CLwEPoFb@oADwFVkFToEVwAFc@B_BHiFZuGb@e@CoKhAsHd@mEXoDTSBeFh@}JnAsOfBwM~Ac@DmALu@JcEb@M@w@JcLzAiFz@k@J{JfB_I~AWFE?[H{JlB}H`BsBb@{A\\UD{KnCkAXaJdCoCv@u@Vw@Po@V{A`@yJxCmFdBm@Po@RuDjAsJhDaA^_@Lu@XODUHk@Tw@X_@N_@NC?]LwDpAuDrA[L}Bz@i@Ra@P_@NwAh@kAb@a@NcBl@_@Lq@VOFa@NaA\\_@NOFkC`A_@N]LC@cC~@_@NgBp@wDrAGBODKDgDlAsAb@cDhAuBn@iBh@uBn@gAXSFOBQFoCr@mFpAkB`@oCj@SDcBX{@NcBXg@HqBXy@Ja@DcJfAkCT{@HqIj@I@Y?[@eJT[@Y@sGJsKAm@AwCI_BEcBEaCKoAE}AKkCQiGg@e@E[E[GwBUiAIqFu@kC_@{@QuDm@sEy@i@Kg@I}JeBqAUi@Ii@IsB]eDg@kDi@sGeAoAQMCgGw@wLwAc@Ec@GuGi@iGi@{AMUAWCm@EYC_ES{DS_@A_@Ci@C{ES_@Ca@EgEIo@AWAmP[qFE{AAc@?{FCoCAc@?a@?wJAg@Ag@AgDE_@?oB@[?[?qHCk@Ak@AoA@gACc@Aa@A_OUuFSgACc@CcHUiCQ_DQ]C[AqD[eGi@uAQSCSCk@G[CYEgAMOAIAWCsAOmBU_Gy@}OkCsFmASGEA[GcOcDIAKCUG{A]wFeBwIiCe@OQIQGiCw@_KwDgIaDqFeCWMWKuD{AWMWKuDcBuDcBgKqE[O[Oe\\{N_@Og@U[O]Oo@[yDcBwI}DgEoBmGqC_EeB[OCAWKCAyGyC{M_GwAm@OGOIeGmC[KoAg@eHqC_Bk@SISImC_AgFoBoPgG{DwAa@OaBo@a@Ma@OSGKEo@U_HeCGASKKCIEc@OsEaBq@YsJaE{FwCOK]SeGuDi@]i@]_FsDqJkIOMWYYWgKsKYYwI_J}N_NgEcDmFsD]U[SuAy@MIOIa@W_Ak@{C_ByAw@cBy@kGwCiGaCeHmC_A]}@]w@[{@[}MeF}@_@_Aa@iCoAcFaC{CgB_@Um@]k@]gGsD_@Ym@a@]UWQECWS_@SEAQOgJkG}DsCe@]e@]a@YEEc@[oHwEg@[SMSO}AcA_IqE]S]QgSmKkBcA}BkAWMGCOGiBq@}FgCcJ}DYKYMeK_ESIKEICyD}A{GmC_Bo@UKIEMEmBy@wB_A{As@_@QeEmBkEuBkAm@wGmDUMIE_H}DgG_EkEsCs@g@gF_EeMaKu@o@y@w@yDqDkDkDqE}EyCkDwDoEq@_AQUk@s@MQOQOSw@kAiA_B}EmHoDkFgCkEU_@eL{RS_@CE}Qq]}EcJgEcIuM{TS[oAkB_BcCaA}A}G}IkBcCmCoDsBmCyAyAcCgCqGkGiHiGy@s@mEkDgD}BuDgCwA{@qEqCMIOI[ScL_GaJyDSKUIkGmCmMaEsC{@}@Ww@UOEQEy@S{Cs@kCk@_B[SEQEyB_@oDo@SCSEkH_AKASCUCuGs@oBQc@CsE_@oBKiEQwBI}@AO?M?yLOqNHU@U?Y?eV^S?U?_LTgMRS@Q@_ABI?O?_O\\mVXU?mC?uCCeFE{GQ}AEkBGmCOgCOSAUAeHi@wCU]CmAQWCa@EgFm@}Cc@k@IiC_@wCg@eEw@kAUeDq@oDw@QEMCOEqA[iBg@gD}@aEkAaCs@eA]u@WeDiAgDoAqBu@{@]kAg@sCmAaBq@_CiA{CwAo@[KGIEmDgBIGcE{BsCaBQKeGeDg@YUMQKaZgRqEuC_DiBoCaBEEGCKGgIqEs@a@aG{CMIICIEiFcCKEIEu@_@aA_@qGiCiE{AwDoAa@KMEMEuAa@cDy@y@UqCi@aGoAwLmBaa@_Gc@GcQgCuUoFQCQEeAU_EoAwKkDyGeCQGSIaDkAiLgFyL{Fq@]gBeA_@U}Q{K]WsA_Ak@[MIsDiCy@m@QOIGGEkCuBqA_AuCcCkB}A[WIGs@q@_@]a@[{NcNKKIIiFaFwFeFa@_@EEIGQOaEcDMKsDqCGEs@g@y@m@EC}AeAk@]_CuAu@a@eAm@CA_@SMG_@SqBaA{BaAeBs@_@MyEcBEAk@SOEoBk@gCs@eAWaBa@kAWaAQi@KwAUw@OaBSoAS}@KmBSQASCSAg@EiCU{CSgBKaFWyESKA[AoBIwGYs@EcAGwF_@MCWACAwAMaDa@{AUoB[IAaAQcB[IAqA[_AUkG}AgEkAeBg@a@Ka@Ka@M{Bo@mQ}EQEOGOEgI}B}C{@GASGQGqA]WI_@IwFuAa@K_@K_AWqZoIMEKCk@OuGoB_KyCQEgA[eBg@{QeFWGUIeIyBi@Og@OkDaAMEMCsCw@WIWIeGaBSGoDaA[I[KmDgA_Co@}Ac@YGYIaWiHeFuAeBm@]M[KcRuGu@[mHyCYKYK{HmDaAc@{HoDQIOGgHeDwLuFEAcDsA_@OiP{GUKUIqCiAcOkFsBm@WIYIsBm@iTyFSGSEgAY{@Uk@KWGYGeNqCcBWWEWEsDm@{B_@wAUYEWEcC]iEk@aAMYCWEcBSaCWuEe@a@EgAMUCUA{AOwFi@aCUeGi@SAA?oBS{@IQAQAoAKsAO_AKyAKcAK_NsAe@Ea@EE?iGk@qC_@cD]uCY}@I]E_@C]EuDe@_CS{@GgAKqAMy@IiBQoBS_@CKCkE_@kD_@yEe@yC]mC[mDa@u\\oEsOoCSESEkB[_JcBgEw@aEw@kDu@oCm@qBg@_Du@cDk@aJ}BcFsAaEcAw@U}Ag@qAa@e@MoCaAuBq@_Cw@aBi@aEwAoEyAQGSGc@OcDiA}@[kDmA_@MWKkAa@[M]Mm@Uq@W_@Oc@OgBq@YKcE_Bc@Oa@Qm@UaL{EaEeB[M_@QiHgDyAq@{Ao@c@UkCoASIcBy@c@Uc@UyAo@aEwB_Ae@]Sw@a@qAq@oAo@CAwDsBsGkDWMWOyC{AcKwFe@[AAm@[m@]qGoDQIQKWOkJcFMGMI{DsB}@g@{DsBKGIG}BmA{CaB}BmAkH{DQKIE{CaBsC}AOIOGaCoAOKQIkAo@{EcCuDcBOGMGgAg@aAc@CA_CaAIEIEqBy@oIeDu@WUGWIuE_BICqGoBwAa@MEOEoHwB_E}@u@Oa@KiCk@KCKC{A[a@Ia@IQCOE_F}@SCQCsE{@_IcAy@GQAQCsDWkE]qKm@SASAqAGA?a@A{FGkGGyHD}GN]@S@U@_BFmERiIl@iBLWBG@gFj@_Ef@gFz@kF|@cGrAWFWFYHyA\\sAZsFvAmEnASDGBYHUH{F|Am@Ny@TsLhDMDKBuCv@yFzA]HC@YHuA\\_IbBu@Pk@HODOBsJhBOBi@HiM`BqANaD\\iBNO@Q@uALM@M@cDVc@BeAHkBHc@B{CLkEJM?O?kJRo@?oF?I?I?]?qJGiCIWAUAcCGwKe@s@GyGe@oBQsNcBKAMCy@IcMoBOEQE_AQuBc@sBc@}Bg@A?QESEg@MiBa@_AUSEgAWaCo@w@Se@MwDaAaGeBC?]MgDeAOEOGkDcAsEyASGQGu@UiTkHuDsAw@Yk@QMGaA]mP{FaA]GAWKSGQGSIqDmAk@QcJwCGAk@S}@YgGiB}DiAmBk@WGWIiBc@wDaAiLsCKCm@MUGc@I]K{@QQEGAYGeCi@eAUIAUEuDo@GCGAyB_@KAKCu@MIAGAWEc@IkHmAuAQa@GmC]a@GsL_BaCUoPaBkJs@a@CcBMmG_@aGY_GS_EKUAC?_@?_HMoHGsCEc@AeAC]@c@?gA@_@AA?eA?c@?oC@kA@a@?G?uDFwEJ{ELoENyDLa@BO?Q@i@@kDHaENsELaEL{DNgDH_@@S@S@gBBgDFkCDuBB{BBQ?Q@kBBoAB_CBkCB{ABe@?c@AE?{AA[?aLGwDOy@Cy@EiEOQAcCOqF_@qDUaAKmFi@qB[oCYUC_C[w@Ma@IiB[yHsAGCgAQkKsB}@Q_AQkI_BeAUgASiH}AsBa@}Cm@wB]oFw@qAQs@KWCIA}H_AsE_@sFe@SASAin@iDG?KAE?EA}BO}BS}KcAgH}@mC[sAQwFgAiGmAcMqC_AUaG}AiFuAu@SeD}@gEiAmBg@OEOE_@I_EeAaB_@YGMEOCYGc@IKEKCqD}@kAUgB_@k@K_AQ{AUcC_@YCGAIAoH{@yHq@uBMmACO?OA}CGcEG}E@qFJiHRqDLkBFgTp@uM@c@?c@?S?aCCeIYqCMkD[mCSgCYgAM[EmAQm@K}GoA{Be@aEeAcCo@yBm@aEmA]KWIiEkAqC{@mC{@SIsDeAgBi@iA[cEmAICkCq@u@U{Bk@}@U{DaACAa@IkBe@_AS_AUiFeAkGkAiEs@kAOgDi@]EeC_@cC[eFk@wD]s@Gc@EgAIyBScDQKAK?WCiH_@oDMAAW?EA]?y@CmDKyCE_@AE?]AE?yDCuBC}K@_BByA@cBDY?M@qA@}@@c@@mDDuFJeBDS?U@iCDeHL_HLuEBc@?mLDkACc@?c@AmJOc@?G?[?MAw@?yBKyH]uCMyGc@UCSAWAsBOgCWsBSQA{BUa@Ec@GiBSWCOCsAQE?_@G_@GgBU}B]oB]{B[oASWEeC_@iSuCcNsBgOyBOAOCgIkAc@IkNqBKAKCwNsBMCMCcSsCQCQE_P{B[G[EkG}@wMmB_@Ga@G{K}AaFs@yRuDqAYmIgBKCa@K_EaAgMkD[I[I{JmCWIUG_AWo@QOEa@KaEiAUGWI_HiBuD_AEAMCSG{EkASEa@IcAWuGwAuGkAsHsAyEk@SCQC{KuAQCWCe@GiJo@i@Ei@E_F]mTs@_FAwEAc@?sDAW@W?gEFoBBqA@iDJS@U@G@sDLO?O@e@@Q@G@M?U@_Mr@iFV}G\\gADkBJc@BqDPe@Bc@BiDPY@y@Bc@@c@@M?kBD_FLI?yHAk@?E?c@?K?eDKy@Em@CMAC?EAC?kBIwEUSAUAOA_LoAgKmBSE_@K_@I{GaBoOcFoGuC_EkByDuB_@SCA{LgIeBiAiDsCcGaFiAgAQQOQaCaCa@e@o@u@s@{@SUQScCwCsAmBsBuCCCQ[mAkBu@oAIOKQ}@_BkCoFKQGO{AoD}@mCI]Ma@Mc@EMQw@c@qBe@wCESCSW_Be@_FUqEA[A[]kGM{GCq@Es@Eq@"},"start_location":{"lat":22.9995125,"lng":120.2484637},"travel_mode":"DRIVING"},{"distance":{"text":"94.0 公里","value":94037},"duration":{"text":"55分钟","value":3272},"end_location":{"lat":24.7547779,"lng":120.9529751},"html_instructions":"下<b>192-彰化系統<\/b>出口走<b>國道3號<\/b>，前往<b>大甲<\/b><div style=\"font-size:0.9em\">收费路段<\/div>","maneuver":"ramp-right","polyline":{"points":"ssarCkxw~UHq@AKGwAK{AQ}CC[IcAWoBAMGe@E]AGAMGa@Ic@G]ESEQ?CGQGUKSKQQYW]WSUQMGMGSEk@OICOCQAA?UCU?O?U@YBQDYFeBd@QFQDq@Rc@N]J[F]Fg@D]?qBFw@@o@@oA@YAoAMc@?WEuAg@IGi@YkAo@SISEQESEm@C[Aa@BU?s@NKB]P[Ru@t@SXKTUj@Mf@CZCTA\\?d@?@?R?^?DA|@CdB?DE^APOnAYrAI\\o@nBOb@CFAF?D?H@LQb@}B|FGLILiBzD}BhE_A~AKPKRuAtBCFEFKPGHIJu@fA}AvBINILeBxBwCdD{BhCyF|FcFrFaCpCiAlAoAdBOPGHGJq@x@W\\kCjD_IhKwAdB]`@}AhBWZ}BlCWZ}BlCqBzB}@z@eBxAGD_CxAID_Bt@}CzA_ElB_@P_@P}GdD_@P_HbDGDGBgE`CCB_@R]RYN_@P_@PqB~@i@XGBKDSJwAj@_CbAcHvC]LIDIDULcBx@oD~A}DhBEBGBIBsBz@s@XIBGB{@\\cBh@SDa@LgAZ_AR}@RE@[FYFYDUDYDYBaC`@oANeCPgAF}A?sA?uBB_@Cw@Cs@Ea@AuBGo@GYEI?OC}C[cGmAc@Ma@Ka@MgAYaDeAa@Q_@Q}DgBa@UiDmB[SaAq@mBwA}AuA}AwAACm@m@EGY]q@w@SS_CwCsAiBW[?AU[_CaDQUEGIMa@e@kBqBe@k@]_@}CkDQMOOMMMKYYMKs@o@IIKIMKMKMMcA_AsDcCUYSWaHuEMIOKOKKGIGuBwAoC{BSOGIIEy@s@gCmCq@y@i@m@IMU[KOKO]g@U[U[Yc@{AwCGIIOIQiAeCwAiDWu@iBeFOc@GQGOw@sBEMK]i@yAIUQa@K[CGa@cAEMMUQa@MYQa@CGu@}Am@mAw@wAU[EIGIMS]k@CEW[e@o@q@{@SUIKMOcCiCWWeA}@mAaAuAaAc@WkC{Am@[KGuAs@]OcAc@OGQIQG{@]SIAA]Mu@[gBs@qAe@sAg@yAk@g@Se@QkBy@QG_@QoB}@mAq@i@YoAw@?Ak@_@gA{@USEC[Ys@q@o@m@GG}AcBmAwAaAuAsAoBS[o@_AU]]g@i@cA{@iBGO_@{@c@uAm@sBO}@I]kAiFk@gDc@wCQ_BGe@AKKq@kAqIa@cCq@_DQu@Qw@Mg@Uy@c@yAUu@s@sBk@}AIQwB{EmBsDs@mAwAcCo@}@q@{@KQiCgDcBmB_@]OOGEGGkDcDmB{AsBcB}DkCwAcA]UsAaAKGiC_B}@g@QKKGGEg@W{DwBaDgB{EcCeAc@w@_@A?QIQIo@WuAm@e@Se@S_@QwAm@kBw@KC_@OoAc@QGQIgDeAa@McEsAcCu@OEME_EeAGAGCcGwAGCGAmCk@}A]oAYaASkAUy@QsAYcAS{@QSEMCc@IgB_@gCg@uA[yA]OEMCw@S{Bi@qA]{Ac@mBm@{Ag@mAc@IEKCi@SeAa@s@[QIMGs@[KEIEqAm@iAm@{@c@[QgAm@w@e@]SwD{B]UqAw@uHgEiCoA}@c@GEYKwDyAoA_@a@KuAc@uCq@iAUa@IiB]mDe@e@GiBMa@EK?{@GgAEgBKsDCwCBkHXiE\\]DaCZgBXoAXa@JE@yBj@wCx@wCz@q@RcA`@kBr@g@PiEbByChAw@Xs@Va@NIDm@RKDyAd@oCx@aAXa@JMBq@NA@}Bd@kCf@C?YFYD{BZcCViBNeAHc@Be@BiBJ_EH_DBQ?iCCgBCyDOy@Gc@CI?qBOoAIqCWEAc@EwC]WEeAOcBWEAeAQy@OKA[EmBe@E?]IcASc@KIAWGcAW_@KA?cAYc@MqCw@{@_@cGsB_A[}F_CiB{@OIOGu@_@cFqCMGMIwBoA}B_BCCYSqAaAuAaAwAmAcAs@cFwDAAYUiEcD[UsB}AkF}CsBoAoAg@iDoACAaD_ASEQGwBw@o@KQESCoG}@[EYC{@Ic@KcAKmAIwBIc@?E?i@@_GWQ?[CG?c@AqHe@kAKoD[mC[gCc@cBYYGkAYmBe@YKaEwAe@SiCmAo@]eAi@_Ak@WS]WmA}@aAw@uAgAIIeAcA_@[iAoAW[SS]e@W[o@y@CE}@wAo@iA}@cB{AwBsBmDKOW]}@wAW_@Wa@OUkAaB[e@Y]a@m@QWc@o@y@gAKMm@q@o@s@i@o@[YECUUKISU_@_@YYu@s@IIQOw@q@[W[YcAw@aCiBOKWOEEOKYQ_Ak@UQECQMMGoAu@]S]S_@U]S]SIEUKa@Q_@O_@OKE_@QaAa@_Bq@a@O_Aa@_@Qa@O_@OwEaBGCaAYsF_BUGSGiBk@UIUGyHyBMEKEICWMSGcBk@_@Oa@Ma@MGCWKgA]}Am@a@OYKEC_@Qg@SWMo@[o@[MGQI_@SIGSMyA_A]Ue@YUO_@S]Uc@WWQ]U]U]WKIMIe@]yEaEg@g@uBuBm@w@_BiBKMIIIKyCqDiCuDa@i@kBuCwAcCo@oAS_@Sa@S_@EIEIUe@k@iAmAsCqAsDQc@CKEKKWm@sBi@kBi@eBu@oCg@kCe@yBYsAUkAKe@aA_FIe@wAkHa@qBGa@I_@Ie@ESEQ_@gBEWCGc@mB]iAEOs@aCa@wAe@wAm@gBOa@MWEKUk@Se@M]iB_EGOaAmBaAiBOUIKGKoAsBk@{@OUEGeAwAaBuBY]W[W[Y[UUUWqGiG]U[WeA{@yAeAaC_BsBmASMSO_I{DgB}@uAk@_Bo@SIMGaC_AA?_@Oa@MaA_@o@UsGsBoAc@}@UeASiAQUEQCe@I_ASg@Ma@Iy@QyCo@qAYsCi@IAeASUGEA[Gi@KuCe@gB[OCSAeAM[EIA_BS_CYya@gFa@Ec@GSASCqB[QAGAYEcMqAMCMAeC[eJeAOCQEwKoAaEg@SCGA[EcAMgG}@kAQeBYcBWqGu@e@GqDYeAG}CWm@IC?wI}@eDa@yBY{AQUEUCUAy@Mc@EKAA?]EeGq@kGu@iC_@c@Ee@CkC_@mC]a@GyDg@_BSgGu@y@Ky@KoDa@w@IyBWoBW_@E_@EmC[iFm@EAOCGAE?UC}Ca@SEQCqHcAEAa@I_@IaDo@WGWGaIaBWEWGqBc@_D}@SGUGmBk@_FcBUIUIaC{@eEeBQIQGWMeG}CYSa@S_@QmEaCECAAEASMSMGEGCsAu@IEIEmFuCIEIGkEeCKGKGcDmBKGMIwA_AQKQKg@[SKQKw@e@kBaAMGMGoHsDWIUKmBs@MEMGaBm@YKSOSMcBk@yD}@m@MsDu@uDi@gDYa@EQAwDSoBE{@AmE@eBFoCL]B[B{@DgAHuCXcH|@i@JG@c@FiGlA}HbBiDx@E@MDSDyN`DiKbCwDt@uHfA}Db@uCVkBPuALcDLc@BmBHoBJkDJeA?c@@gA?g@?E?c@?K?wCCeBAM?UAgACaAE]Ac@Cm@Cc@ASAs@EKAK?WCsJq@KAa@GgH_A{AYaB]wD}@}Ac@sAa@i@QkDiA_DmASGQIk@SiAg@m@Yy@c@GE_Ai@a@WsBqASMcD}BqA_AIEGGSOGEmA}@{CsCeAgAc@c@c@g@m@q@[_@GKMOuEcGMOMOo@y@MQMOQWeA_BKQIOk@{@cAaBw@sAe@w@aB{CIOIMGOoAcCmAaCCG]o@IOQ_@m@iA_ByCMWGGmB{CyA{B_BeC{A}Bc@o@IMKOeBaCmBqBOQGIGG]_@GIOOMMcAgAcB}AoA_Aq@i@GCaAq@A?[UUO]Um@c@sA{@YQ[QWOe@U_@S_@Q]QA?_@SKGSIaBq@GCWKcA_@iAc@}@Yu@UyBi@sAW}A[cC]k@IYCy@I]E_@EkC]qJaAUEQAsEk@iCc@c@KGAa@Ik@O{@QSG{@Qm@Qi@M{Ae@{BaAOGoAi@sAy@{FmDeDuBUQ[UQMIIu@m@iBgBcAaAqAsAsB_CaBoBsAcB_@i@SYgHyIW]oDmE}AmBY[W]MOKKYYgG{GwAoAsE{DmAgAgBsA_CaBcCaBa@U[SA?[Sq@a@sEcCqBaA]Q]Q]Q}DiBcCiA_Ac@yBcAOGq@[o@[q@[yCwAyDqB{BuAaBiAy@i@i@_@KGcBgAu@i@gAy@y@q@_Ay@e@c@qBkBqBuB_@a@MMKKkAmAmD{DuEcFgBqBW[sC_DGGe@e@mCqCoAoAKMMKkBkB}@{@WUWUoBeBu@o@]W_Au@yC}BMKOKyAiA_Aq@_BeAOI]UcDsBGEcBaAcDcBYOEASKy@_@y@_@SIKEECuK_G_@S{A{@_@S_@S{BmA]SkAo@MGMGa@S]S]SaNoHKIIG]SeDwBgBmA]W}FcEQMOMq@g@gIyGuCmCWUCASSWWqGqGSUGEIIMM{A_BKKKKoCoCY[u@u@MMMMkGkGY[AAgB_Bw@q@w@o@MKIIGG]WOOKGIGiFsD}CiBaAi@e@Wc@U_@Sq@[i@UsEoBqBw@oAc@cDeAoBi@wA_@aDq@SESEq@Kq@McAQ{Ba@cBU{BWIAYEYEqAOuAQSEm@Km@IeAQc@GoDg@KAUEu@M}@OgAOWE_AOaCc@wA[yBe@uBo@}@[[O{Au@w@]iAm@mAs@mAo@uAy@oAy@WQGE[SgBoAaAu@MKUQUQoBeBi@e@iCiCo@s@OSCCUWqCgD{CqEmGsKa@}@Qa@Sa@}JaUo@wAo@uAeE{HsCqEeCgDOUMUy@eAoB{BuD{Dc@e@KK}CkCo@k@o@k@m@g@wAeAWUWSgBuAUQa@[[WmGuEkEaDy@m@]WSOMKo@i@}@y@cBgBaAaAOIe@]sAwA}BkCqCsDS]S_@i@w@iDiGe@eAQc@yBcF{@_C_@aAOYMWOc@AEOe@Uo@gBsF}@oCQa@GSYu@e@uAo@iBOc@Oa@Oc@?AOc@}CoHQc@Qa@Yq@?A[m@aAoBIMGKi@aAm@gAs@eAIOKOCGU[SWOUMOIMIIGGSUMMEEQYIKIKmBcCcAcAuAsAoAiACCWY}@u@q@g@[U[WwA}@qA{@CCWOIEIC]USKIGuAs@_CgAGCOGMEICUIkBs@_@OaBm@eFwASAQCgBa@KCWESGSGqB]_AMOEIAYGwASc@GMCMEeAQa@G?A{@MaBS{Fi@wAQ_BI_CWsB]gCa@]EqDo@UEWGKCIA}A_@yAa@gDaAcBs@o@[{@c@[M]MWKwBaAgD_B}EoCKIQK{@i@MIgDaCuAgAgCsBcA{@OO_@_@[[a@_@USc@c@k@]{@eA{DuDoAoA_AaAg@k@Y]GGEIyDqEo@s@KOGGEEUW]a@qFyGW[Y]mCeD}CoDcDuDUWUWcE_EiJ_KcOmPsIkJ}OcQOQECUU[[[YiE}DyEuD[WA?g@]QM[U}B{AcEeCc@S_@QkEsBwF{BYIWIuEaB[KUGEA]I}@S{@S{@SwDo@WCc@GoBWgCWE?MCc@Ea@EaBIcBKsCGsCI}BE}IHK?wABoIT_@?wEDgAAc@?c@?c@?MAq@?A?c@E_BQeAMGAq@I{@I_AKQEQCa@Gi@KMC{@MiB_@qA[yAc@ICQGMEC?gBm@cBo@a@O}@a@iAg@c@SQKSKGE_@UeAk@oAw@eC_BkBoAqCoBmByAWSCCw@q@kA_AuCcCiB}AuBqBgC_CkDoDoF_GoB_CsBkCqAgBGI_AsA}@uA]m@U_@U_@S[Ua@U_@k@cAy@aBEMGKc@w@CIQa@c@cAQa@c@cA]w@mBuFQe@Ma@ACOa@Ok@oAsDYmAMc@yDoMI[KYe@iBcAqDcAkDcAmDAEK[]aAAC[gAM]K[u@{CW{@W}@sAuEOc@i@mBYaA[aAkEkOMc@uE_PK[KYu@mBY{@EMGK}@eCi@wAIOGQGSWm@Wk@u@gBGQ_@u@y@cB}AuCkAwBeAkBIMIMuBcDQYw@iAgAyAoBcCKOMMm@q@u@_Aa@g@[[e@e@sAqA}A}AiDyCgB{AWQ{@u@ECUSiA{@cDaCqBuAA?[U]UCAYSCA{@i@yBqA[QcAm@WO_@QAA]Q}Ay@MGq@]YMEC]QYO_Bs@g@UsCoAmFaC_@Oa@Q_Ac@sFcCkDeBgAk@}Ay@wAy@u@e@qBsAg@]uBgBwE}DQQkAoAi@k@c@e@cAkAQQ}AqBsAqBu@gA[g@GKgAeBIO[m@Q]KSKScBmD]_AsAqDQc@GQYu@Um@ACw@wBWw@m@iBeAeDkAcDCIg@wAEIM]M[M[gBoEs@cBSe@U_@o@kA_@o@cAgBe@w@_@i@g@u@[_@y@eAc@g@_@c@]c@GGkBoBSUUWWY_A{@UOQOmA_A}AoAuD{C]U{AoAaAu@]W}@u@uAaAkBsAe@]q@o@u@m@w@s@UQk@m@kAsA{@aA}@iAo@}@QYs@eAa@o@y@uAs@yAYm@GQ_@y@CIc@eAM[Sk@q@uB[kAq@kCi@mCGc@Ig@Ko@S}AEc@Ea@OyBKgBC{AAm@E{D?GAw@?_A?eB@qABkBDcBHuF@aEAaF?i@AmA?e@?AGyBAyAGcAOoBE_@E]AIKs@AMAMKu@Gg@y@sE]wAKg@eAqEiAiE_@wA"},"start_location":{"lat":24.0980209,"lng":120.5493356},"travel_mode":"DRIVING"},{"distance":{"text":"2.8 公里","value":2810},"duration":{"text":"2分钟","value":105},"end_location":{"lat":24.7579489,"lng":120.9795919},"html_instructions":"靠<b>左<\/b>继续沿<b>國道3號<\/b>行驶<div style=\"font-size:0.9em\">收费路段<\/div>","maneuver":"keep-left","polyline":{"points":"k|avCcsfaV{@kB{HuQOa@Um@Wk@M[}@iCa@oAcAkDg@oBUgAOs@UaBGa@c@aEMcAEa@AIEe@Gs@KmAI{ACy@EiACs@A}AAaA?UDqCBi@@e@Ba@Be@@M@i@F{@H}@Dm@Da@De@Fe@Fg@BUBQBUBMJy@Fg@Hg@Fc@Fg@Hg@Hg@Ju@Nw@Fg@Fe@Jg@Fc@Hc@D]D_@D_@BY@IDm@Fm@@c@Bi@@Q@SBe@@g@?K?Y@g@?w@?k@Ag@?AAw@?GAq@Cm@Aq@Ao@Ai@Cg@Cq@Em@Em@Gc@Gy@Y_DG{@"},"start_location":{"lat":24.7547779,"lng":120.9529751},"travel_mode":"DRIVING"},{"distance":{"text":"80.0 公里","value":79982},"duration":{"text":"51分钟","value":3056},"end_location":{"lat":24.9945399,"lng":121.5935439},"html_instructions":"靠<b>左<\/b>继续沿<b>國道3號<\/b>行驶<div style=\"font-size:0.9em\">收费路段<\/div>","maneuver":"keep-left","polyline":{"points":"epbvCmykaV_@sCMsAIoACg@A]Cq@A}@AgBAyAD{AJ}BDg@Dg@Fw@XcCPkAb@}B^iBJe@Py@J]@EFWDQDOBMLe@Lc@Lc@Pu@^yAn@eCd@uBVoAN}@Lo@f@uDViCX}EDiI?UAQ?ECy@CWAO?GOkBc@sDQcA]yBq@oEIo@_@qCYeBEe@Ge@Ga@Ek@MkAOsB?AEoACg@E{@CwC@uB@_A@o@@o@NwCReCL{A?Ef@eE`@sB^aBFYBKHe@F[XsAzB_JJe@VgA\\aB`@qBf@oCDSFc@Jy@RgBL}ADe@NiBLoCBeBBcAB_A?_BCmAAc@?CIuBAOAWI_BEk@Gu@Im@E[Gg@?CGa@Gg@Ic@Ic@Ke@Kk@AIKg@]sAMk@YgAMe@k@mBWs@Oa@a@eAQe@a@aA[u@aAmBYk@g@{@Ya@sAcBw@kAeAwAeBqBi@u@CEe@m@SUoAsAWYq@}@s@{@w@gAiAiBeAaBmBwDS_@MY}@cC{@yCMe@Y_AUgAU}@a@yBk@mEE[QgDAOEk@AyAA{CB{BFwBHkABk@D}@JqAF]^wCNaAJq@`@qBHc@ZqARq@x@kCx@aCN]Ra@x@gBpGcMR_@Te@b@}@DIxAyChAmCpAaD`@sAnAgEFQLc@@Ct@wDLi@L{@Ny@RsAf@uE`@gGDg@Be@@a@D_D@E?oB?Q?[?gACyAAc@Cg@EmA?KA[KgBEu@Ee@CUUwBcAkHeBqH_BmFISCKKSEMCGMYq@}AO]O[Qa@Ui@g@kAOYCGKSaBcDwByDQUU_@U_@oBaDSWQYMQa@i@OSOSq@_AKOAAMQ}DmEQSQQwCkC][KMcBaBaAq@cDqC]WQOaBoAmC}BqBcBo@k@IGGIQOg@_@_HgGm@m@WWAAUUuDuDcBoBqBiCkBeC[a@_@i@iDmFmAuBg@aAIUIUACa@aAq@wAo@wASk@Uk@EOGOmAoD_@iAm@gBy@mCc@yA]qAOm@EUCSAAe@yB_@gBO_Ae@mCEYAOCOM_AOgAGk@Go@Iu@MkA[_EG_AC[IuAG_BGgBK}CAgAGaC?]EaBA{@CiA?g@AS?}@AmDA}CAkDAI?g@GgCEsCKmCEy@]yDEe@AAOqAOeAIe@_@iCYuAOi@Mc@I]Ok@Mc@EQGQ[aAAEOc@KYm@}A[u@AAQ_@a@}@y@}Au@sAc@u@GIOSW]m@{@KMm@q@eAsAqBuBaA}@q@m@oByAWOKGKI_@Si@[{A}@mAm@eCkA_@Q[QUIUKmAe@aAc@uCiAa@O]MwCmAqCiAiBw@mAi@iAi@i@UgAg@aAe@QKMIQIQIuAw@mAq@aCwAk@_@]Uq@c@s@g@_@YSOQOkA{@{@s@mA_AqAiA_Aw@cA}@c@c@SSKIOMQM_CkCwAaBEGGIIKU_@W[MQgAaBi@w@ACS[GKkDoFi@y@Ya@KSKSOYoBwD]s@i@gACIKUMUu@aB}BeGkAqDKc@KWEKCKi@gBMe@Uw@W_Aa@mB_@aBEQ]eBScA]}BWaB?EQiAAKQoBU}Bc@yDIq@KeAGy@Ew@Cg@AK?IOcDIgDAgAAUEaCAaD?wCBiADcCPeFJeBB]B]@MZcEHy@R_CZoCJq@DWDW\\iCx@_FbAaFt@yCb@{ABKLc@@Cn@}Bj@aBlAkDrCgHJWFOzEcKrAkCh@_AP[P[bMyUxEcKdA}CNe@VgAFWFYBKBK|@wD\\kBFa@N}@PcAD_@BUBYLwADo@@]?E?a@?A?u@@W?m@?W@o@@_@?ADW@OPyA?e@?g@?}@KmEAe@IoACe@SqCUqBGg@KaACIGe@EYSoAg@aC]yAI[CIQm@w@eC?AOa@c@oAk@uAqAiC}@cBkAgBoAmB{EkG{FcFGGWSw@o@u@c@IGuAw@yDmBcGcCoA]sBe@kBa@mB[KCa@GmC_@eAKc@Ec@EeAKc@GG?[Cc@Cc@C]AGAa@C[CaAGC?oCG_@AC?c@@c@?c@?c@@c@?c@BeADe@BS@c@@S@O@oDF_EHmEPoCDc@@c@@wMV}JXU@S?[@yLXa@?c@@uINgKR}B@kKRc@@c@@c@?{MVyBB_@@iK\\uEHaJHgABkDFQ?c@AmD?g@Ec@Cc@Ec@Cc@Cc@CAAuCYYCa@GQAwASc@GOCQEkCi@OC{DeAICWIsC_AsAi@aA]mAk@oBeAsBgAg@[}@i@g@YgCkBc@[kD_DMMQQQSGGY[_BcBoA}AQSCCSWeA}AoAeBCCU_@wA}BGMKQS_@U_@a@u@qAqCc@}@gBwEEMM[Ug@EKgBuEc@{AQg@MYgBwEUy@GUGSqAaFI]YqAIYGYU{Ag@wCGg@?AIg@?AQ}@Kk@Ia@SeASeAW{@GYKs@GUCUES}@iGeAsHKm@Kk@gAmH_BiKEUEUGa@G_@mBaJ[mACMEM_CeIeBcFyAmDsCeGQ_@MUoEeHyDcF_@a@YYWYiHeHKIKI{N}Ma@]YUYWYUcC{B_B}AuCkDiEyFgC_EcCoEiFsMkFePOg@Qe@eFcMKUMUq@sAuCkFeFyGIMKMEGwBcCkE{D{@s@MIKIsAcA}E{CsBiAqDmBaCaA[M[M}K}DiA_@a@O_@OsPgGe@QoFeCCAqCwAKG_@QmAq@sA{@MKOKkAu@_E_DkCwBgC}Bs@q@YY_A}@uBgC_BqBU[aDkEgBmCgAgB_BsCc@aASc@[q@Yu@_@cAa@iAo@gBgAiE}@oEUoBKu@OqAIw@UyBQeBKqA}@qKQyBk@_E}@gEo@aCMc@qBaFc@w@O]Q[M[mAyBcAuAi@o@aBoBcB{AcCuBkBmAQKaEsBaGgCsKoEs@]aDaBkD{B{@k@KMo@e@m@g@SQwCyCsB}BaCgDyAmCuAoCcA}Bu@iB{@{B_A}BeC{G{@uBoAaDaCiFEIQ]S]k@gAKOwA_CmD}Es@w@IKIIkB{ByDsDe@]KIKIeCyBOKMKc@_@qB_BcCoBIIwAoAQOQM[YOMKIu@s@CAs@o@UUwAsAmAiAk@m@GEIKKKgBuBIIEIGG{BgDy@gA}AsC{@eBEKGKMYo@}Ai@yAUk@Wu@[eAa@yAIW]wAG[Ke@]mBQaAIa@Gc@[{CESEa@KcA?MKqAEw@Es@Ce@?u@EiB?iA?gABy@@a@FsABg@@W?GXeEh@kFFc@BQBOHg@@Mf@cDFa@Ji@Hg@Jg@pAcG|@wDnDiNvA{FFSFQ`@cBh@wBr@aDh@_Df@wCN{@t@yEJw@Fm@@CTkCL}BNgDBuB?c@?i@?g@@g@?qBEkBG_A?QAQSuCO_BMcAAKWyAw@cEU}@Om@Su@Mc@AAKa@Mc@Sm@Qo@Uq@KUEKEGk@{Ao@qAa@w@kA}Bi@y@wAqBqAeBi@m@W]A?_@g@SWoA{AY[_AkA}@aAOOmCwCq@q@QQOOQQOOo@q@SSoAqAqAsAWWWWOQQQQQUY{FmGMQOUGGIK{AoBgEqGwFmKKSMYmBsEsBsFISGSo@eBaBaGGUGSGQ}AwFy@kDESEMCOy@oE[uB_@aCKy@Ge@Ik@KgACOAMCOWoEOaCCgAAI?IMgCMoEC_G@a@?sD?O@O@yB?IBoADkBJeEL_F@a@@c@~@oUFwAfAkWBu@?I?A@WF_B@e@F}A?O@MDmAJqC?K@I@_@L{DDwAXiFBk@@[@K^aJ?QDaABe@@c@BiABuB?kB?yA?SCwAIiBM}AU}BSmAKm@Mk@[yA_@sAc@uAs@kB}@mB{@yAOWU_@W]_AmAaAgA_C_CwAmA_BqAcDmCKIKIu@k@{@}@UWSWw@w@cByBiBoCU[w@uAKQKQEGg@eAKW_@iA_@eAa@sAg@{BYaBUaBIi@MkAGu@E_@Ca@A]q@kIC]C]{@{L_@kCIc@Gc@Ks@[cBCKg@wBm@mCCGK_@Og@g@sAu@mB[u@IQIQiBgEuAcCaA}AiAiBOQQWAAU[Ya@s@{@qAwAWWUWUUa@_@{AkA{AmAuAcAKKMIWSwCeBWMQKSKuMyG_EeCWQSMcBoA}ByB[WWYY[?AsAaBcA_Bw@}AWi@qAeDq@_C[oA[kBUyA]sDCm@Ag@Ce@?qB?gB?W?Y?SByGPoI@m@?]?]B{AGmC?CE}@E{@SoBKgACUCUIgA_@_C]qA]sAACEOEQOg@g@iBeAgCoBoDoAwBmB_Dg@q@MOMQg@q@cEuFIKIK[e@KKa@i@c@i@_LaN}ByCmCqDi@s@MO_AoAQUq@aAYc@k@{@Yc@Ya@s@cAw@kAGKu@aAaAuAmAgB_AuA_AwAEG[o@a@{@_@{@i@mAQc@Qe@IUEOMc@U{@SmAS_ASkAWoBCWEw@G{@Co@Ao@?EAiA@q@B_BBiADu@HgALgA@GHw@Hg@?EHi@Jm@RcAJe@XcAPk@Le@Lc@HSZy@Zu@b@aABGRc@h@kALUR_@f@w@f@q@^g@`@k@b@e@r@{@\\e@\\c@bG}G`BiBX[fCqC`FuGdCgDd@q@V]T]V_@NWx@uAd@{@b@aA@Af@kAHS^{@p@kB^kAVy@ZgAl@kCNm@DUVuATuAV{A@QBQBOHq@LmAR}BJsAPmC@[Dy@HuC@}B?}A?o@K}CKwDEwC@yCHcCFgBJkCPqBNqA@EHm@@EXeBR{@@CVaABKDMZiA\\_AJ[JYXw@zCwFRWJQLOp@aA`CqCv@s@tDgD`Aw@lBcBrBcBf@c@pI}GxD}C|VgS`FeEn@k@ZWDE`JqHFGZWdB}AFGZYPQZWj@o@n@s@b@g@d@o@l@_A`@s@Zi@Xk@^}@L_@Tm@Nk@^uARaAJo@NkAJy@Fw@@OHuA?gA?iA?[A[?[?AA]AOASASEm@?AEe@AKQ_ACSg@sCsAsDa@eAmEuHsBoBmAeAm@c@m@c@qAmAkGkEcSkNyB}AyAeA[SyAeAg@]mA_AYSAAwAgAsB}AMIuAgAk@e@OOsAiAyBkBgAeA_A}@w@{@k@m@Y]AAm@u@Y]eAwAe@q@s@iAIMg@{@IOKOu@uAO[MUcA{BYs@Q_@e@mAEIGQGQGQGQGQ_@mAa@_BWaAIc@Kg@Ia@AIEWG]G_@Iy@Ge@?AE[Eo@IiAEy@Co@As@Ag@?g@?_@?a@@o@Bq@@U@e@Bc@De@Di@JoARaBB[NeAR_B`@{CHo@BOBOFc@LkA?ANkAH{@Hw@Fm@B_@Bc@Ba@Dq@Dm@Bi@@W?UFeCBaA@cB@i@Ae@Cs@?m@EiCAe@Ew@Cg@Aa@Ew@M{AUsBe@aEMmAGg@C[CIQkAWcB{BoIi@iBOg@Oe@i@{ASg@Sg@Sg@Sg@u@}Ae@aASa@_@y@aAcBWe@_@m@_@o@AAW][e@wAmBmA{AkAwAc@a@m@k@aC}BGIo@m@i@e@e@]cBmAkCeB]S}@i@sBkAGC_Ae@_Ac@_@QcAg@{@]gAc@[KcBm@s@Wo@Qa@Mo@OQEwCq@gAWUGKAa@KeAU_@Ge@GMC_BQaAOc@GeAOc@Ga@Gc@Gy@KQCEA_AMeDc@"},"start_location":{"lat":24.7579489,"lng":120.9795919},"travel_mode":"DRIVING"},{"distance":{"text":"1.7 公里","value":1681},"duration":{"text":"1分钟","value":88},"end_location":{"lat":25.0028083,"lng":121.5905135},"html_instructions":"下<b>20-木柵<\/b>出口，前往<b>木柵<\/b>/<wbr/><b>台北<\/b><div style=\"font-size:0.9em\">收费路段<\/div>","maneuver":"ramp-right","polyline":{"points":"{vpwCsvceVGICCCAGEUEGAIC[G]GQG]Kw@[GCGCMEo@]IEIEIGMIKIOKMISOKIKKIIKIGGOOQSOMSUWY[]UWMOKIOOIIYWAA[W]WQKKIe@YOISKa@S[MMGGC]M_@MGCQEOGEAQEE?C?CAKAICKAOCWEWCUCQCGAG?OAO?KAQ?W?W@Q@S@Q@]FSDOBIBOFUJWLULUPA@OJIHEDEDIJKLGFEHEFCBKPEHKRGLABA@ABGPADGNGRCLEJAFAH?@CRCPCf@A\\?N?P@V@X@TBR?@BV@BBTBJ@JNz@VnAJd@F\\@DDRBP@HBNBNBVBV@L@J?@@R@P@R?T?N?d@Al@ANAVAFAJE\\?FAF?H?R"},"start_location":{"lat":24.9945399,"lng":121.5935439},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 公里","value":588},"duration":{"text":"1分钟","value":29},"end_location":{"lat":25.004145,"lng":121.5848747},"html_instructions":"走<b>國道3甲<\/b><div style=\"font-size:0.9em\">收费路段<\/div>","maneuver":"merge","polyline":{"points":"qjrwCucceVIj@Mp@kAhHo@rDq@dEAJCLk@rEGl@E`@ATAP"},"start_location":{"lat":25.0028083,"lng":121.5905135},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 公里","value":567},"duration":{"text":"1分钟","value":33},"end_location":{"lat":25.0069523,"lng":121.5813902},"html_instructions":"下<b>3-萬芳<\/b>出口，前往<b>信義路<\/b><div style=\"font-size:0.9em\">收费路段<\/div>","maneuver":"ramp-right","polyline":{"points":"{rrwCm`beVKTAF?BANI~@KjAGl@AJAPKtB?PAH?JA@CD?BAB?F?B?DCNALENAJCFEJCJCDCFEHEFEHGHEDGFEDGDMJA?GDKFGBA@MDQFUDUDUDE?MBM@G?I@Y@c@@G?]?a@CSAOAGAG?QB"},"start_location":{"lat":25.004145,"lng":121.5848747},"travel_mode":"DRIVING"},{"distance":{"text":"3.0 公里","value":3020},"duration":{"text":"3分钟","value":209},"end_location":{"lat":25.0319919,"lng":121.5718269},"html_instructions":"走<b>信義快速道路<\/b>","maneuver":"merge","polyline":{"points":"mdswCujaeVs@Gc@EWA{AK}@Ee@AkAGw@CsFAc@AE?eDBoADo@@W@c@BqAHsAJc@DuANcALG@cC\\I@{@Pu@Pq@Lc@J_@HeAVyA`@qAd@}@ZcA\\_@LA@_A^i@Tu@\\g@Tw@`@]P}Az@_@RMHsBhAuAx@qAp@UL{@d@qAr@[P]P]RWNe@VUL}@f@KF]R_@POFmAp@{DvB{Az@yF|CYPc@T_@R{BlA_@RaFlC[ROFwAx@mAb@[Jy@PmANI?aBNW@"},"start_location":{"lat":25.0069523,"lng":121.5813902},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 公里","value":163},"duration":{"text":"1分钟","value":15},"end_location":{"lat":25.0329333,"lng":121.570835},"html_instructions":"下<b>左侧<\/b>出口，前往<b>基隆路<\/b>/<wbr/><b>市政中心<\/b>","maneuver":"ramp-left","polyline":{"points":"}`xwC}n_eVg@HYDC?G@G@E@GBG@CBC@EBC@GFEDCDCBADCBCFABADADAFCJCRA`@AHAB?BCBCD"},"start_location":{"lat":25.0319919,"lng":121.5718269},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 公里","value":246},"duration":{"text":"1分钟","value":45},"end_location":{"lat":25.0328975,"lng":121.5683962},"html_instructions":"走<b>信義路五段<\/b>","maneuver":"merge","polyline":{"points":"yfxwCuh_eVAZJfEC`G"},"start_location":{"lat":25.0329333,"lng":121.570835},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 公里","value":302},"duration":{"text":"1分钟","value":68},"end_location":{"lat":25.0329662,"lng":121.5654019},"html_instructions":"继续沿<b>信義路五段<\/b>直行","maneuver":"straight","polyline":{"points":"sfxwCoy~dV?\\CbFAzACfCCpA?^"},"start_location":{"lat":25.0328975,"lng":121.5683962},"travel_mode":"DRIVING"}]
             * traffic_speed_entry : []
             * via_waypoint : []
             */

            private DistanceBean distance;
            private DurationBean duration;
            private String end_address;
            private EndLocationBean end_location;
            private String start_address;
            private StartLocationBean start_location;
            private List<StepsBean> steps;
            private List<?> traffic_speed_entry;
            private List<?> via_waypoint;

            public DistanceBean getDistance() {
                return distance;
            }

            public void setDistance(DistanceBean distance) {
                this.distance = distance;
            }

            public DurationBean getDuration() {
                return duration;
            }

            public void setDuration(DurationBean duration) {
                this.duration = duration;
            }

            public String getEnd_address() {
                return end_address;
            }

            public void setEnd_address(String end_address) {
                this.end_address = end_address;
            }

            public EndLocationBean getEnd_location() {
                return end_location;
            }

            public void setEnd_location(EndLocationBean end_location) {
                this.end_location = end_location;
            }

            public String getStart_address() {
                return start_address;
            }

            public void setStart_address(String start_address) {
                this.start_address = start_address;
            }

            public StartLocationBean getStart_location() {
                return start_location;
            }

            public void setStart_location(StartLocationBean start_location) {
                this.start_location = start_location;
            }

            public List<StepsBean> getSteps() {
                return steps;
            }

            public void setSteps(List<StepsBean> steps) {
                this.steps = steps;
            }

            public List<?> getTraffic_speed_entry() {
                return traffic_speed_entry;
            }

            public void setTraffic_speed_entry(List<?> traffic_speed_entry) {
                this.traffic_speed_entry = traffic_speed_entry;
            }

            public List<?> getVia_waypoint() {
                return via_waypoint;
            }

            public void setVia_waypoint(List<?> via_waypoint) {
                this.via_waypoint = via_waypoint;
            }

            public static class DistanceBean {
                /**
                 * text : 318 公里
                 * value : 317580
                 */

                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class DurationBean {
                /**
                 * text : 3 小时 22 分钟
                 * value : 12114
                 */

                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class EndLocationBean {
                /**
                 * lat : 25.0329662
                 * lng : 121.5654019
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StartLocationBean {
                /**
                 * lat : 22.9997357
                 * lng : 120.2269966
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StepsBean {
                /**
                 * distance : {"text":"37 米","value":37}
                 * duration : {"text":"1分钟","value":7}
                 * end_location : {"lat":23.0000545,"lng":120.227089}
                 * html_instructions : 从<b>小東路198巷6弄</b>向<b>北</b>行驶，到<b>小東路</b>/<wbr/><b>180縣道</b>
                 * polyline : {"points":"kckkCwyx|U}@Q"}
                 * start_location : {"lat":22.9997357,"lng":120.2269966}
                 * travel_mode : DRIVING
                 * maneuver : turn-right
                 */

                private DistanceBeanX distance;
                private DurationBeanX duration;
                private EndLocationBeanX end_location;
                private String html_instructions;
                private PolylineBean polyline;
                private StartLocationBeanX start_location;
                private String travel_mode;
                private String maneuver;

                public DistanceBeanX getDistance() {
                    return distance;
                }

                public void setDistance(DistanceBeanX distance) {
                    this.distance = distance;
                }

                public DurationBeanX getDuration() {
                    return duration;
                }

                public void setDuration(DurationBeanX duration) {
                    this.duration = duration;
                }

                public EndLocationBeanX getEnd_location() {
                    return end_location;
                }

                public void setEnd_location(EndLocationBeanX end_location) {
                    this.end_location = end_location;
                }

                public String getHtml_instructions() {
                    return html_instructions;
                }

                public void setHtml_instructions(String html_instructions) {
                    this.html_instructions = html_instructions;
                }

                public PolylineBean getPolyline() {
                    return polyline;
                }

                public void setPolyline(PolylineBean polyline) {
                    this.polyline = polyline;
                }

                public StartLocationBeanX getStart_location() {
                    return start_location;
                }

                public void setStart_location(StartLocationBeanX start_location) {
                    this.start_location = start_location;
                }

                public String getTravel_mode() {
                    return travel_mode;
                }

                public void setTravel_mode(String travel_mode) {
                    this.travel_mode = travel_mode;
                }

                public String getManeuver() {
                    return maneuver;
                }

                public void setManeuver(String maneuver) {
                    this.maneuver = maneuver;
                }

                public static class DistanceBeanX {
                    /**
                     * text : 37 米
                     * value : 37
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class DurationBeanX {
                    /**
                     * text : 1分钟
                     * value : 7
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class EndLocationBeanX {
                    /**
                     * lat : 23.0000545
                     * lng : 120.227089
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class PolylineBean {
                    /**
                     * points : kckkCwyx|U}@Q
                     */

                    private String points;

                    public String getPoints() {
                        return points;
                    }

                    public void setPoints(String points) {
                        this.points = points;
                    }
                }

                public static class StartLocationBeanX {
                    /**
                     * lat : 22.9997357
                     * lng : 120.2269966
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }
        }
    }
}

