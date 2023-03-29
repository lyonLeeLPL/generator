package com.baomidou.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author baomidou
 * @since 2023-03-29
 */
@TableName("ams_t0001")
public class AmsT0001 implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * タイムスタンプ
     */
    private String zztimestamp;

    /**
     * 行番号
     */
    private Integer zzline;

    /**
     * 処理ステップ
     */
    private String zzprStep;

    /**
     * マスタモデル
     */
    private String zzmasterMod;

    /**
     * レガシシステムキー (ビジネスパートナ)
     */
    private String zzoldkeyBp;

    /**
     * レガシシステムキー (契約アカウント：集約)
     */
    private String zzoldkeyCac;

    /**
     * レガシシステムキー (契約アカウント)
     */
    private String zzoldkeyCa;

    /**
     * レガシシステムキー (供給対象)
     */
    private String zzoldkeyCo;

    /**
     * レガシシステムキー (需要場所)
     */
    private String zzoldkeyPr;

    /**
     * レガシシステムキー (インストレーション)
     */
    private String zzoldkeyIn;

    /**
     * レガシシステムキー (インストレーションファクト)
     */
    private String zzoldkeyInf;

    /**
     * レガシシステムキー (装置情報レコード)
     */
    private String zzoldkeyDv;

    /**
     * レガシシステムキー (装置取付)
     */
    private String zzoldkeyDvm;

    /**
     * レガシシステムキー (契約)
     */
    private String zzoldkeyCt;

    /**
     * レガシシステムキー (プロファイルヘッダ)
     */
    private String zzoldkeyPf;

    /**
     * レガシシステムキー (プロファイル割当)
     */
    private String zzoldkeyPa;

    /**
     * 登録成功フラグ (インストレーションファクト)
     */
    private String zzflgInf;

    /**
     * 登録成功フラグ (装置情報レコード)
     */
    private String zzflgDv;

    /**
     * 登録成功フラグ (装置取付)
     */
    private String zzflgDvm;

    /**
     * 登録成功フラグ (プロファイルヘッダ)
     */
    private String zzflgPf;

    /**
     * 登録成功フラグ (プロファイル割当)
     */
    private String zzflgPa;

    /**
     * 供給停止伝票番号
     */
    private String zzdocNo;

    /**
     * ホスト: ビジネスパートナ
     */
    private String zzpartnerH;

    /**
     * ホスト: 集約契約アカウント
     */
    private String zzabwvkH;

    /**
     * 契約内容通知の連続番号
     */
    private String zzzkeithuno;

    /**
     * 料金計算月
     */
    private String zzbillPid;

    /**
     * ビジネスパートナ
     */
    private String zzpartner;

    /**
     * 集約契約アカウント
     */
    private String zzabwvk;

    /**
     * 契約アカウント
     */
    private String zzvkont;

    /**
     * 契約
     */
    private String vertrag;

    /**
     * インストレーション
     */
    private String anlage;

    /**
     * 需要場所
     */
    private String vstelle;

    /**
     * 供給対象
     */
    private String haus;

    /**
     * 検索語句 1/2(左)
     */
    private String zzbuSort1;

    /**
     * 名称
     */
    private String zznameOrg1;

    /**
     * 郵便番号
     */
    private String zzpostCode1;

    /**
     * 住所カナ
     */
    private String zzstreetI;

    /**
     * 地名
     */
    private String zzstreet;

    /**
     * 建物コード
     */
    private String zzbuilding;

    /**
     * 地名３
     */
    private String zzstrSuppl2;

    /**
     * 気付
     */
    private String zznameCo;

    /**
     * 第1電話番号の市外局番
     */
    private String zztelNoF1;

    /**
     * 第1電話番号の市内局番
     */
    private String zztelNoF2;

    /**
     * 第1電話番号の加入者番号
     */
    private String zztelNoF3;

    /**
     * 第2電話番号の市外局番
     */
    private String zztelNoM1;

    /**
     * 第2電話番号の市内局番
     */
    private String zztelNoM2;

    /**
     * 第2電話番号の加入者番号
     */
    private String zztelNoM3;

    /**
     * 外部アドレス番号
     */
    private String zzadext;

    /**
     * 銀行コード
     */
    private String zzbankl;

    /**
     * 銀行口座
     */
    private String zzbankn;

    /**
     * 管理キー
     */
    private String zzbkont;

    /**
     * 口座名義人
     */
    private String zzkoinh;

    /**
     * Type
     */
    private String zzccins;

    /**
     * カード番号
     */
    private String zzccnum;

    /**
     * 支払条件
     */
    private String zzzahlkond;

    /**
     * 個別請求書発行希望
     */
    private String zzflgccivprt;

    /**
     * 代替BP 出荷管理
     */
    private String zzsendctRh;

    /**
     * 一括郵送対象外
     */
    private String zznoctrsnd;

    /**
     * 口座情報出力希望
     */
    private String zzflgnoprtbk;

    /**
     * CA管理区分
     */
    private String zzcaknrKbn;

    /**
     * 入金方法
     */
    private String zzezawe;

    /**
     * 旧システム契約
     */
    private String zzvrefer;

    /**
     * 契約クラス
     */
    private String zzcontclass;

    /**
     * 契約開始日（締結日）
     */
    private String zzcntstr;

    /**
     * 契約満了予定日
     */
    private String zzcntend;

    /**
     * 業種コード
     */
    private String zzbrnche;

    /**
     * 契約対象
     */
    private String zztarget;

    /**
     * 入札フラグ
     */
    private String zzbidflg;

    /**
     * 料金 Cat.
     */
    private String zztariftyp;

    /**
     * 供給方式
     */
    private String zzkykymtd;

    /**
     * 検針単位
     */
    private String zzableinh;

    /**
     * 郵便番号/市区町村(左)
     */
    private String zzcoPostcd1;

    /**
     * 地名
     */
    private String zzcoStreet;

    /**
     * 供給ポイント ID
     */
    private String zzextUi;

    /**
     * 契約電流
     */
    private String zzdmMnCc;

    /**
     * 契約容量
     */
    private String zzdmMnCa;

    /**
     * 契約電力
     */
    private String zzdmMnLc;

    /**
     * 世帯数
     */
    private String zzfcMnHh;

    /**
     * 手入力加重平均力率
     */
    private String zzfcWaWa;

    /**
     * 契約決定区分
     */
    private String zzfcMnOe;

    /**
     * 時報警報区分
     */
    private String zzfcMnIa;

    /**
     * 最低使用期間開始月
     */
    private String zzfcSi01;

    /**
     * 停止日
     */
    private String zzrtOpBx;

    /**
     * 手入力マイコン(温水器)割引対象機器契約容量
     */
    private String zzdmCa9o;

    /**
     * 手入力マイコン(蓄熱式暖房)割引対象機器契約容量
     */
    private String zzdmCa9p;

    /**
     * 手入力5時間(蓄熱式暖房)割引対象機器契約容量
     */
    private String zzdmCa9q;

    /**
     * 手入力5時間(その他)割引対象機器契約容量
     */
    private String zzdmCa9r;

    /**
     * 手入力非蓄熱式電気暖房割引額1型対象機器の総容量
     */
    private String zzdmCaNa;

    /**
     * 手入力非蓄熱式電気暖房割引額2型対象機器の総容量
     */
    private String zzdmCaNb;

    /**
     * 手入力センサー割引対象率・低
     */
    private String zzfcRaLn;

    /**
     * 手入力マイコン割引対象率・低
     */
    private String zzfcRaMl;

    /**
     * 再エネ賦課金減免率
     */
    private String zzfcMnRr;

    /**
     * 手入力基本料金割引額
     */
    private String zzqtDgD11;

    /**
     * 需要家口数
     */
    private String zzdmMnCr;

    /**
     * 手入力電灯数(100W超過1)
     */
    private String zzfcEb11;

    /**
     * 手入力電灯数(100W超過2)
     */
    private String zzfcEb12;

    /**
     * 手入力電灯数(100W超過3)
     */
    private String zzfcEb13;

    /**
     * 手入力電灯数(100W超過4)
     */
    private String zzfcEb14;

    /**
     * 手入力電灯数(100W超過5)
     */
    private String zzfcEb15;

    /**
     * 手入力電灯容量(100W超過1)
     */
    private String zzfcEb21;

    /**
     * 手入力電灯容量(100W超過2)
     */
    private String zzfcEb22;

    /**
     * 手入力電灯容量(100W超過3)
     */
    private String zzfcEb23;

    /**
     * 手入力電灯容量(100W超過4)
     */
    private String zzfcEb24;

    /**
     * 手入力電灯容量(100W超過5)
     */
    private String zzfcEb25;

    /**
     * 手入力電灯数(10W以下)
     */
    private String zzfcEb01;

    /**
     * 手入力電灯数(11～20W)
     */
    private String zzfcEb02;

    /**
     * 手入力電灯数(21～40W)
     */
    private String zzfcEb03;

    /**
     * 手入力電灯数(41～60W)
     */
    private String zzfcEb04;

    /**
     * 手入力電灯数(61～100W)
     */
    private String zzfcEb05;

    /**
     * 手入力小型機器数(100VA超過1)
     */
    private String zzfcEh11;

    /**
     * 手入力小型機器数(100VA超過2)
     */
    private String zzfcEh12;

    /**
     * 手入力小型機器数(100VA超過3)
     */
    private String zzfcEh13;

    /**
     * 手入力小型機器数(100VA超過4)
     */
    private String zzfcEh14;

    /**
     * 手入力小型機器容量(100VA超過1)
     */
    private String zzfcEh21;

    /**
     * 手入力小型機器容量(100VA超過2)
     */
    private String zzfcEh22;

    /**
     * 手入力小型機器容量(100VA超過3)
     */
    private String zzfcEh23;

    /**
     * 手入力小型機器容量(100VA超過4)
     */
    private String zzfcEh24;

    /**
     * 手入力小型機器数(50VA以下)
     */
    private String zzfcEh01;

    /**
     * 手入力小型機器数(51～100VA)
     */
    private String zzfcEh02;

    /**
     * 外部入力機器レンタル料消費税率
     */
    private String zzqtRcRxa;

    /**
     * 外部入力物件区分
     */
    private String zzfcMnOta;

    /**
     * 外部入力機器１レンタル料
     */
    private String zzqtRc1ra;

    /**
     * 外部入力機器２レンタル料
     */
    private String zzqtRc2ra;

    /**
     * 外部入力機器３レンタル料
     */
    private String zzqtRc3ra;

    /**
     * 外部入力機器４レンタル料
     */
    private String zzqtRc4ra;

    /**
     * 外部入力機器５レンタル料
     */
    private String zzqtRc5ra;

    /**
     * 外部入力機器６レンタル料
     */
    private String zzqtRc6ra;

    /**
     * 外部入力機器７レンタル料
     */
    private String zzqtRc7ra;

    /**
     * 外部入力機器８レンタル料
     */
    private String zzqtRc8ra;

    /**
     * 外部入力合計額
     */
    private String zzqtTaTaar;

    /**
     * 外部入力合計額_消費税等相当額
     */
    private String zzqtTaTxar;

    /**
     * 外部入力合計額_免税額
     */
    private String zzqtTaXfar;

    /**
     * 外部入力合計額_外税額
     */
    private String zzqtEnTaar;

    /**
     * 予定期間１
     */
    private String zzudSi01F;

    /**
     * 予定期間１
     */
    private String zzudSi01T;

    /**
     * 一世帯電流
     */
    private String zzdmMnUh;

    /**
     * 実使用期間
     */
    private String zzrtOpB2;

    /**
     * 実使用期間（有効開始日）
     */
    private String zzrtOpB2F;

    /**
     * 実使用期間（有効終了日）
     */
    private String zzrtOpB2T;

    /**
     * eTime3プラン判定区分
     */
    private String zzetimeInd;

    /**
     * 集約CA支払条件
     */
    private String zzzahlkondC;

    /**
     * 処理ステータス
     */
    private String zzprocStat;

    /**
     * 予備１
     */
    private String zzreserve1;

    /**
     * 予備２
     */
    private String zzreserve2;

    /**
     * 予備３
     */
    private String zzreserve3;

    /**
     * 予備４
     */
    private String zzreserve4;

    /**
     * 予備５
     */
    private String zzreserve5;

    /**
     * 予備６
     */
    private String zzreserve6;

    /**
     * 予備７
     */
    private String zzreserve7;

    /**
     * 予備８
     */
    private String zzreserve8;

    /**
     * 予備９
     */
    private String zzreserve9;

    /**
     * 予備１０
     */
    private String zzreserve10;

    /**
     * バージョン
     */
    private Integer version;

    /**
     * 作成者
     */
    private String creationUserId;

    /**
     * 作成日時
     */
    private LocalDateTime creationDttm;

    /**
     * 更新者
     */
    private String updtdUserId;

    /**
     * 更新日時
     */
    private LocalDateTime updtdDttm;

    /**
     * 登録更新成功フラグ (ビジネスパートナ)
     */
    private String zzflgBp;

    /**
     * 登録更新成功フラグ (契約アカウント：集約)
     */
    private String zzflgCac;

    /**
     * 昼インストレーション判定結果区分
     */
    private String zzinindD;

    /**
     * 夜インストレーション判定結果区分
     */
    private String zzinindN;

    public String getZztimestamp() {
        return zztimestamp;
    }

    public void setZztimestamp(String zztimestamp) {
        this.zztimestamp = zztimestamp;
    }

    public Integer getZzline() {
        return zzline;
    }

    public void setZzline(Integer zzline) {
        this.zzline = zzline;
    }

    public String getZzprStep() {
        return zzprStep;
    }

    public void setZzprStep(String zzprStep) {
        this.zzprStep = zzprStep;
    }

    public String getZzmasterMod() {
        return zzmasterMod;
    }

    public void setZzmasterMod(String zzmasterMod) {
        this.zzmasterMod = zzmasterMod;
    }

    public String getZzoldkeyBp() {
        return zzoldkeyBp;
    }

    public void setZzoldkeyBp(String zzoldkeyBp) {
        this.zzoldkeyBp = zzoldkeyBp;
    }

    public String getZzoldkeyCac() {
        return zzoldkeyCac;
    }

    public void setZzoldkeyCac(String zzoldkeyCac) {
        this.zzoldkeyCac = zzoldkeyCac;
    }

    public String getZzoldkeyCa() {
        return zzoldkeyCa;
    }

    public void setZzoldkeyCa(String zzoldkeyCa) {
        this.zzoldkeyCa = zzoldkeyCa;
    }

    public String getZzoldkeyCo() {
        return zzoldkeyCo;
    }

    public void setZzoldkeyCo(String zzoldkeyCo) {
        this.zzoldkeyCo = zzoldkeyCo;
    }

    public String getZzoldkeyPr() {
        return zzoldkeyPr;
    }

    public void setZzoldkeyPr(String zzoldkeyPr) {
        this.zzoldkeyPr = zzoldkeyPr;
    }

    public String getZzoldkeyIn() {
        return zzoldkeyIn;
    }

    public void setZzoldkeyIn(String zzoldkeyIn) {
        this.zzoldkeyIn = zzoldkeyIn;
    }

    public String getZzoldkeyInf() {
        return zzoldkeyInf;
    }

    public void setZzoldkeyInf(String zzoldkeyInf) {
        this.zzoldkeyInf = zzoldkeyInf;
    }

    public String getZzoldkeyDv() {
        return zzoldkeyDv;
    }

    public void setZzoldkeyDv(String zzoldkeyDv) {
        this.zzoldkeyDv = zzoldkeyDv;
    }

    public String getZzoldkeyDvm() {
        return zzoldkeyDvm;
    }

    public void setZzoldkeyDvm(String zzoldkeyDvm) {
        this.zzoldkeyDvm = zzoldkeyDvm;
    }

    public String getZzoldkeyCt() {
        return zzoldkeyCt;
    }

    public void setZzoldkeyCt(String zzoldkeyCt) {
        this.zzoldkeyCt = zzoldkeyCt;
    }

    public String getZzoldkeyPf() {
        return zzoldkeyPf;
    }

    public void setZzoldkeyPf(String zzoldkeyPf) {
        this.zzoldkeyPf = zzoldkeyPf;
    }

    public String getZzoldkeyPa() {
        return zzoldkeyPa;
    }

    public void setZzoldkeyPa(String zzoldkeyPa) {
        this.zzoldkeyPa = zzoldkeyPa;
    }

    public String getZzflgInf() {
        return zzflgInf;
    }

    public void setZzflgInf(String zzflgInf) {
        this.zzflgInf = zzflgInf;
    }

    public String getZzflgDv() {
        return zzflgDv;
    }

    public void setZzflgDv(String zzflgDv) {
        this.zzflgDv = zzflgDv;
    }

    public String getZzflgDvm() {
        return zzflgDvm;
    }

    public void setZzflgDvm(String zzflgDvm) {
        this.zzflgDvm = zzflgDvm;
    }

    public String getZzflgPf() {
        return zzflgPf;
    }

    public void setZzflgPf(String zzflgPf) {
        this.zzflgPf = zzflgPf;
    }

    public String getZzflgPa() {
        return zzflgPa;
    }

    public void setZzflgPa(String zzflgPa) {
        this.zzflgPa = zzflgPa;
    }

    public String getZzdocNo() {
        return zzdocNo;
    }

    public void setZzdocNo(String zzdocNo) {
        this.zzdocNo = zzdocNo;
    }

    public String getZzpartnerH() {
        return zzpartnerH;
    }

    public void setZzpartnerH(String zzpartnerH) {
        this.zzpartnerH = zzpartnerH;
    }

    public String getZzabwvkH() {
        return zzabwvkH;
    }

    public void setZzabwvkH(String zzabwvkH) {
        this.zzabwvkH = zzabwvkH;
    }

    public String getZzzkeithuno() {
        return zzzkeithuno;
    }

    public void setZzzkeithuno(String zzzkeithuno) {
        this.zzzkeithuno = zzzkeithuno;
    }

    public String getZzbillPid() {
        return zzbillPid;
    }

    public void setZzbillPid(String zzbillPid) {
        this.zzbillPid = zzbillPid;
    }

    public String getZzpartner() {
        return zzpartner;
    }

    public void setZzpartner(String zzpartner) {
        this.zzpartner = zzpartner;
    }

    public String getZzabwvk() {
        return zzabwvk;
    }

    public void setZzabwvk(String zzabwvk) {
        this.zzabwvk = zzabwvk;
    }

    public String getZzvkont() {
        return zzvkont;
    }

    public void setZzvkont(String zzvkont) {
        this.zzvkont = zzvkont;
    }

    public String getVertrag() {
        return vertrag;
    }

    public void setVertrag(String vertrag) {
        this.vertrag = vertrag;
    }

    public String getAnlage() {
        return anlage;
    }

    public void setAnlage(String anlage) {
        this.anlage = anlage;
    }

    public String getVstelle() {
        return vstelle;
    }

    public void setVstelle(String vstelle) {
        this.vstelle = vstelle;
    }

    public String getHaus() {
        return haus;
    }

    public void setHaus(String haus) {
        this.haus = haus;
    }

    public String getZzbuSort1() {
        return zzbuSort1;
    }

    public void setZzbuSort1(String zzbuSort1) {
        this.zzbuSort1 = zzbuSort1;
    }

    public String getZznameOrg1() {
        return zznameOrg1;
    }

    public void setZznameOrg1(String zznameOrg1) {
        this.zznameOrg1 = zznameOrg1;
    }

    public String getZzpostCode1() {
        return zzpostCode1;
    }

    public void setZzpostCode1(String zzpostCode1) {
        this.zzpostCode1 = zzpostCode1;
    }

    public String getZzstreetI() {
        return zzstreetI;
    }

    public void setZzstreetI(String zzstreetI) {
        this.zzstreetI = zzstreetI;
    }

    public String getZzstreet() {
        return zzstreet;
    }

    public void setZzstreet(String zzstreet) {
        this.zzstreet = zzstreet;
    }

    public String getZzbuilding() {
        return zzbuilding;
    }

    public void setZzbuilding(String zzbuilding) {
        this.zzbuilding = zzbuilding;
    }

    public String getZzstrSuppl2() {
        return zzstrSuppl2;
    }

    public void setZzstrSuppl2(String zzstrSuppl2) {
        this.zzstrSuppl2 = zzstrSuppl2;
    }

    public String getZznameCo() {
        return zznameCo;
    }

    public void setZznameCo(String zznameCo) {
        this.zznameCo = zznameCo;
    }

    public String getZztelNoF1() {
        return zztelNoF1;
    }

    public void setZztelNoF1(String zztelNoF1) {
        this.zztelNoF1 = zztelNoF1;
    }

    public String getZztelNoF2() {
        return zztelNoF2;
    }

    public void setZztelNoF2(String zztelNoF2) {
        this.zztelNoF2 = zztelNoF2;
    }

    public String getZztelNoF3() {
        return zztelNoF3;
    }

    public void setZztelNoF3(String zztelNoF3) {
        this.zztelNoF3 = zztelNoF3;
    }

    public String getZztelNoM1() {
        return zztelNoM1;
    }

    public void setZztelNoM1(String zztelNoM1) {
        this.zztelNoM1 = zztelNoM1;
    }

    public String getZztelNoM2() {
        return zztelNoM2;
    }

    public void setZztelNoM2(String zztelNoM2) {
        this.zztelNoM2 = zztelNoM2;
    }

    public String getZztelNoM3() {
        return zztelNoM3;
    }

    public void setZztelNoM3(String zztelNoM3) {
        this.zztelNoM3 = zztelNoM3;
    }

    public String getZzadext() {
        return zzadext;
    }

    public void setZzadext(String zzadext) {
        this.zzadext = zzadext;
    }

    public String getZzbankl() {
        return zzbankl;
    }

    public void setZzbankl(String zzbankl) {
        this.zzbankl = zzbankl;
    }

    public String getZzbankn() {
        return zzbankn;
    }

    public void setZzbankn(String zzbankn) {
        this.zzbankn = zzbankn;
    }

    public String getZzbkont() {
        return zzbkont;
    }

    public void setZzbkont(String zzbkont) {
        this.zzbkont = zzbkont;
    }

    public String getZzkoinh() {
        return zzkoinh;
    }

    public void setZzkoinh(String zzkoinh) {
        this.zzkoinh = zzkoinh;
    }

    public String getZzccins() {
        return zzccins;
    }

    public void setZzccins(String zzccins) {
        this.zzccins = zzccins;
    }

    public String getZzccnum() {
        return zzccnum;
    }

    public void setZzccnum(String zzccnum) {
        this.zzccnum = zzccnum;
    }

    public String getZzzahlkond() {
        return zzzahlkond;
    }

    public void setZzzahlkond(String zzzahlkond) {
        this.zzzahlkond = zzzahlkond;
    }

    public String getZzflgccivprt() {
        return zzflgccivprt;
    }

    public void setZzflgccivprt(String zzflgccivprt) {
        this.zzflgccivprt = zzflgccivprt;
    }

    public String getZzsendctRh() {
        return zzsendctRh;
    }

    public void setZzsendctRh(String zzsendctRh) {
        this.zzsendctRh = zzsendctRh;
    }

    public String getZznoctrsnd() {
        return zznoctrsnd;
    }

    public void setZznoctrsnd(String zznoctrsnd) {
        this.zznoctrsnd = zznoctrsnd;
    }

    public String getZzflgnoprtbk() {
        return zzflgnoprtbk;
    }

    public void setZzflgnoprtbk(String zzflgnoprtbk) {
        this.zzflgnoprtbk = zzflgnoprtbk;
    }

    public String getZzcaknrKbn() {
        return zzcaknrKbn;
    }

    public void setZzcaknrKbn(String zzcaknrKbn) {
        this.zzcaknrKbn = zzcaknrKbn;
    }

    public String getZzezawe() {
        return zzezawe;
    }

    public void setZzezawe(String zzezawe) {
        this.zzezawe = zzezawe;
    }

    public String getZzvrefer() {
        return zzvrefer;
    }

    public void setZzvrefer(String zzvrefer) {
        this.zzvrefer = zzvrefer;
    }

    public String getZzcontclass() {
        return zzcontclass;
    }

    public void setZzcontclass(String zzcontclass) {
        this.zzcontclass = zzcontclass;
    }

    public String getZzcntstr() {
        return zzcntstr;
    }

    public void setZzcntstr(String zzcntstr) {
        this.zzcntstr = zzcntstr;
    }

    public String getZzcntend() {
        return zzcntend;
    }

    public void setZzcntend(String zzcntend) {
        this.zzcntend = zzcntend;
    }

    public String getZzbrnche() {
        return zzbrnche;
    }

    public void setZzbrnche(String zzbrnche) {
        this.zzbrnche = zzbrnche;
    }

    public String getZztarget() {
        return zztarget;
    }

    public void setZztarget(String zztarget) {
        this.zztarget = zztarget;
    }

    public String getZzbidflg() {
        return zzbidflg;
    }

    public void setZzbidflg(String zzbidflg) {
        this.zzbidflg = zzbidflg;
    }

    public String getZztariftyp() {
        return zztariftyp;
    }

    public void setZztariftyp(String zztariftyp) {
        this.zztariftyp = zztariftyp;
    }

    public String getZzkykymtd() {
        return zzkykymtd;
    }

    public void setZzkykymtd(String zzkykymtd) {
        this.zzkykymtd = zzkykymtd;
    }

    public String getZzableinh() {
        return zzableinh;
    }

    public void setZzableinh(String zzableinh) {
        this.zzableinh = zzableinh;
    }

    public String getZzcoPostcd1() {
        return zzcoPostcd1;
    }

    public void setZzcoPostcd1(String zzcoPostcd1) {
        this.zzcoPostcd1 = zzcoPostcd1;
    }

    public String getZzcoStreet() {
        return zzcoStreet;
    }

    public void setZzcoStreet(String zzcoStreet) {
        this.zzcoStreet = zzcoStreet;
    }

    public String getZzextUi() {
        return zzextUi;
    }

    public void setZzextUi(String zzextUi) {
        this.zzextUi = zzextUi;
    }

    public String getZzdmMnCc() {
        return zzdmMnCc;
    }

    public void setZzdmMnCc(String zzdmMnCc) {
        this.zzdmMnCc = zzdmMnCc;
    }

    public String getZzdmMnCa() {
        return zzdmMnCa;
    }

    public void setZzdmMnCa(String zzdmMnCa) {
        this.zzdmMnCa = zzdmMnCa;
    }

    public String getZzdmMnLc() {
        return zzdmMnLc;
    }

    public void setZzdmMnLc(String zzdmMnLc) {
        this.zzdmMnLc = zzdmMnLc;
    }

    public String getZzfcMnHh() {
        return zzfcMnHh;
    }

    public void setZzfcMnHh(String zzfcMnHh) {
        this.zzfcMnHh = zzfcMnHh;
    }

    public String getZzfcWaWa() {
        return zzfcWaWa;
    }

    public void setZzfcWaWa(String zzfcWaWa) {
        this.zzfcWaWa = zzfcWaWa;
    }

    public String getZzfcMnOe() {
        return zzfcMnOe;
    }

    public void setZzfcMnOe(String zzfcMnOe) {
        this.zzfcMnOe = zzfcMnOe;
    }

    public String getZzfcMnIa() {
        return zzfcMnIa;
    }

    public void setZzfcMnIa(String zzfcMnIa) {
        this.zzfcMnIa = zzfcMnIa;
    }

    public String getZzfcSi01() {
        return zzfcSi01;
    }

    public void setZzfcSi01(String zzfcSi01) {
        this.zzfcSi01 = zzfcSi01;
    }

    public String getZzrtOpBx() {
        return zzrtOpBx;
    }

    public void setZzrtOpBx(String zzrtOpBx) {
        this.zzrtOpBx = zzrtOpBx;
    }

    public String getZzdmCa9o() {
        return zzdmCa9o;
    }

    public void setZzdmCa9o(String zzdmCa9o) {
        this.zzdmCa9o = zzdmCa9o;
    }

    public String getZzdmCa9p() {
        return zzdmCa9p;
    }

    public void setZzdmCa9p(String zzdmCa9p) {
        this.zzdmCa9p = zzdmCa9p;
    }

    public String getZzdmCa9q() {
        return zzdmCa9q;
    }

    public void setZzdmCa9q(String zzdmCa9q) {
        this.zzdmCa9q = zzdmCa9q;
    }

    public String getZzdmCa9r() {
        return zzdmCa9r;
    }

    public void setZzdmCa9r(String zzdmCa9r) {
        this.zzdmCa9r = zzdmCa9r;
    }

    public String getZzdmCaNa() {
        return zzdmCaNa;
    }

    public void setZzdmCaNa(String zzdmCaNa) {
        this.zzdmCaNa = zzdmCaNa;
    }

    public String getZzdmCaNb() {
        return zzdmCaNb;
    }

    public void setZzdmCaNb(String zzdmCaNb) {
        this.zzdmCaNb = zzdmCaNb;
    }

    public String getZzfcRaLn() {
        return zzfcRaLn;
    }

    public void setZzfcRaLn(String zzfcRaLn) {
        this.zzfcRaLn = zzfcRaLn;
    }

    public String getZzfcRaMl() {
        return zzfcRaMl;
    }

    public void setZzfcRaMl(String zzfcRaMl) {
        this.zzfcRaMl = zzfcRaMl;
    }

    public String getZzfcMnRr() {
        return zzfcMnRr;
    }

    public void setZzfcMnRr(String zzfcMnRr) {
        this.zzfcMnRr = zzfcMnRr;
    }

    public String getZzqtDgD11() {
        return zzqtDgD11;
    }

    public void setZzqtDgD11(String zzqtDgD11) {
        this.zzqtDgD11 = zzqtDgD11;
    }

    public String getZzdmMnCr() {
        return zzdmMnCr;
    }

    public void setZzdmMnCr(String zzdmMnCr) {
        this.zzdmMnCr = zzdmMnCr;
    }

    public String getZzfcEb11() {
        return zzfcEb11;
    }

    public void setZzfcEb11(String zzfcEb11) {
        this.zzfcEb11 = zzfcEb11;
    }

    public String getZzfcEb12() {
        return zzfcEb12;
    }

    public void setZzfcEb12(String zzfcEb12) {
        this.zzfcEb12 = zzfcEb12;
    }

    public String getZzfcEb13() {
        return zzfcEb13;
    }

    public void setZzfcEb13(String zzfcEb13) {
        this.zzfcEb13 = zzfcEb13;
    }

    public String getZzfcEb14() {
        return zzfcEb14;
    }

    public void setZzfcEb14(String zzfcEb14) {
        this.zzfcEb14 = zzfcEb14;
    }

    public String getZzfcEb15() {
        return zzfcEb15;
    }

    public void setZzfcEb15(String zzfcEb15) {
        this.zzfcEb15 = zzfcEb15;
    }

    public String getZzfcEb21() {
        return zzfcEb21;
    }

    public void setZzfcEb21(String zzfcEb21) {
        this.zzfcEb21 = zzfcEb21;
    }

    public String getZzfcEb22() {
        return zzfcEb22;
    }

    public void setZzfcEb22(String zzfcEb22) {
        this.zzfcEb22 = zzfcEb22;
    }

    public String getZzfcEb23() {
        return zzfcEb23;
    }

    public void setZzfcEb23(String zzfcEb23) {
        this.zzfcEb23 = zzfcEb23;
    }

    public String getZzfcEb24() {
        return zzfcEb24;
    }

    public void setZzfcEb24(String zzfcEb24) {
        this.zzfcEb24 = zzfcEb24;
    }

    public String getZzfcEb25() {
        return zzfcEb25;
    }

    public void setZzfcEb25(String zzfcEb25) {
        this.zzfcEb25 = zzfcEb25;
    }

    public String getZzfcEb01() {
        return zzfcEb01;
    }

    public void setZzfcEb01(String zzfcEb01) {
        this.zzfcEb01 = zzfcEb01;
    }

    public String getZzfcEb02() {
        return zzfcEb02;
    }

    public void setZzfcEb02(String zzfcEb02) {
        this.zzfcEb02 = zzfcEb02;
    }

    public String getZzfcEb03() {
        return zzfcEb03;
    }

    public void setZzfcEb03(String zzfcEb03) {
        this.zzfcEb03 = zzfcEb03;
    }

    public String getZzfcEb04() {
        return zzfcEb04;
    }

    public void setZzfcEb04(String zzfcEb04) {
        this.zzfcEb04 = zzfcEb04;
    }

    public String getZzfcEb05() {
        return zzfcEb05;
    }

    public void setZzfcEb05(String zzfcEb05) {
        this.zzfcEb05 = zzfcEb05;
    }

    public String getZzfcEh11() {
        return zzfcEh11;
    }

    public void setZzfcEh11(String zzfcEh11) {
        this.zzfcEh11 = zzfcEh11;
    }

    public String getZzfcEh12() {
        return zzfcEh12;
    }

    public void setZzfcEh12(String zzfcEh12) {
        this.zzfcEh12 = zzfcEh12;
    }

    public String getZzfcEh13() {
        return zzfcEh13;
    }

    public void setZzfcEh13(String zzfcEh13) {
        this.zzfcEh13 = zzfcEh13;
    }

    public String getZzfcEh14() {
        return zzfcEh14;
    }

    public void setZzfcEh14(String zzfcEh14) {
        this.zzfcEh14 = zzfcEh14;
    }

    public String getZzfcEh21() {
        return zzfcEh21;
    }

    public void setZzfcEh21(String zzfcEh21) {
        this.zzfcEh21 = zzfcEh21;
    }

    public String getZzfcEh22() {
        return zzfcEh22;
    }

    public void setZzfcEh22(String zzfcEh22) {
        this.zzfcEh22 = zzfcEh22;
    }

    public String getZzfcEh23() {
        return zzfcEh23;
    }

    public void setZzfcEh23(String zzfcEh23) {
        this.zzfcEh23 = zzfcEh23;
    }

    public String getZzfcEh24() {
        return zzfcEh24;
    }

    public void setZzfcEh24(String zzfcEh24) {
        this.zzfcEh24 = zzfcEh24;
    }

    public String getZzfcEh01() {
        return zzfcEh01;
    }

    public void setZzfcEh01(String zzfcEh01) {
        this.zzfcEh01 = zzfcEh01;
    }

    public String getZzfcEh02() {
        return zzfcEh02;
    }

    public void setZzfcEh02(String zzfcEh02) {
        this.zzfcEh02 = zzfcEh02;
    }

    public String getZzqtRcRxa() {
        return zzqtRcRxa;
    }

    public void setZzqtRcRxa(String zzqtRcRxa) {
        this.zzqtRcRxa = zzqtRcRxa;
    }

    public String getZzfcMnOta() {
        return zzfcMnOta;
    }

    public void setZzfcMnOta(String zzfcMnOta) {
        this.zzfcMnOta = zzfcMnOta;
    }

    public String getZzqtRc1ra() {
        return zzqtRc1ra;
    }

    public void setZzqtRc1ra(String zzqtRc1ra) {
        this.zzqtRc1ra = zzqtRc1ra;
    }

    public String getZzqtRc2ra() {
        return zzqtRc2ra;
    }

    public void setZzqtRc2ra(String zzqtRc2ra) {
        this.zzqtRc2ra = zzqtRc2ra;
    }

    public String getZzqtRc3ra() {
        return zzqtRc3ra;
    }

    public void setZzqtRc3ra(String zzqtRc3ra) {
        this.zzqtRc3ra = zzqtRc3ra;
    }

    public String getZzqtRc4ra() {
        return zzqtRc4ra;
    }

    public void setZzqtRc4ra(String zzqtRc4ra) {
        this.zzqtRc4ra = zzqtRc4ra;
    }

    public String getZzqtRc5ra() {
        return zzqtRc5ra;
    }

    public void setZzqtRc5ra(String zzqtRc5ra) {
        this.zzqtRc5ra = zzqtRc5ra;
    }

    public String getZzqtRc6ra() {
        return zzqtRc6ra;
    }

    public void setZzqtRc6ra(String zzqtRc6ra) {
        this.zzqtRc6ra = zzqtRc6ra;
    }

    public String getZzqtRc7ra() {
        return zzqtRc7ra;
    }

    public void setZzqtRc7ra(String zzqtRc7ra) {
        this.zzqtRc7ra = zzqtRc7ra;
    }

    public String getZzqtRc8ra() {
        return zzqtRc8ra;
    }

    public void setZzqtRc8ra(String zzqtRc8ra) {
        this.zzqtRc8ra = zzqtRc8ra;
    }

    public String getZzqtTaTaar() {
        return zzqtTaTaar;
    }

    public void setZzqtTaTaar(String zzqtTaTaar) {
        this.zzqtTaTaar = zzqtTaTaar;
    }

    public String getZzqtTaTxar() {
        return zzqtTaTxar;
    }

    public void setZzqtTaTxar(String zzqtTaTxar) {
        this.zzqtTaTxar = zzqtTaTxar;
    }

    public String getZzqtTaXfar() {
        return zzqtTaXfar;
    }

    public void setZzqtTaXfar(String zzqtTaXfar) {
        this.zzqtTaXfar = zzqtTaXfar;
    }

    public String getZzqtEnTaar() {
        return zzqtEnTaar;
    }

    public void setZzqtEnTaar(String zzqtEnTaar) {
        this.zzqtEnTaar = zzqtEnTaar;
    }

    public String getZzudSi01F() {
        return zzudSi01F;
    }

    public void setZzudSi01F(String zzudSi01F) {
        this.zzudSi01F = zzudSi01F;
    }

    public String getZzudSi01T() {
        return zzudSi01T;
    }

    public void setZzudSi01T(String zzudSi01T) {
        this.zzudSi01T = zzudSi01T;
    }

    public String getZzdmMnUh() {
        return zzdmMnUh;
    }

    public void setZzdmMnUh(String zzdmMnUh) {
        this.zzdmMnUh = zzdmMnUh;
    }

    public String getZzrtOpB2() {
        return zzrtOpB2;
    }

    public void setZzrtOpB2(String zzrtOpB2) {
        this.zzrtOpB2 = zzrtOpB2;
    }

    public String getZzrtOpB2F() {
        return zzrtOpB2F;
    }

    public void setZzrtOpB2F(String zzrtOpB2F) {
        this.zzrtOpB2F = zzrtOpB2F;
    }

    public String getZzrtOpB2T() {
        return zzrtOpB2T;
    }

    public void setZzrtOpB2T(String zzrtOpB2T) {
        this.zzrtOpB2T = zzrtOpB2T;
    }

    public String getZzetimeInd() {
        return zzetimeInd;
    }

    public void setZzetimeInd(String zzetimeInd) {
        this.zzetimeInd = zzetimeInd;
    }

    public String getZzzahlkondC() {
        return zzzahlkondC;
    }

    public void setZzzahlkondC(String zzzahlkondC) {
        this.zzzahlkondC = zzzahlkondC;
    }

    public String getZzprocStat() {
        return zzprocStat;
    }

    public void setZzprocStat(String zzprocStat) {
        this.zzprocStat = zzprocStat;
    }

    public String getZzreserve1() {
        return zzreserve1;
    }

    public void setZzreserve1(String zzreserve1) {
        this.zzreserve1 = zzreserve1;
    }

    public String getZzreserve2() {
        return zzreserve2;
    }

    public void setZzreserve2(String zzreserve2) {
        this.zzreserve2 = zzreserve2;
    }

    public String getZzreserve3() {
        return zzreserve3;
    }

    public void setZzreserve3(String zzreserve3) {
        this.zzreserve3 = zzreserve3;
    }

    public String getZzreserve4() {
        return zzreserve4;
    }

    public void setZzreserve4(String zzreserve4) {
        this.zzreserve4 = zzreserve4;
    }

    public String getZzreserve5() {
        return zzreserve5;
    }

    public void setZzreserve5(String zzreserve5) {
        this.zzreserve5 = zzreserve5;
    }

    public String getZzreserve6() {
        return zzreserve6;
    }

    public void setZzreserve6(String zzreserve6) {
        this.zzreserve6 = zzreserve6;
    }

    public String getZzreserve7() {
        return zzreserve7;
    }

    public void setZzreserve7(String zzreserve7) {
        this.zzreserve7 = zzreserve7;
    }

    public String getZzreserve8() {
        return zzreserve8;
    }

    public void setZzreserve8(String zzreserve8) {
        this.zzreserve8 = zzreserve8;
    }

    public String getZzreserve9() {
        return zzreserve9;
    }

    public void setZzreserve9(String zzreserve9) {
        this.zzreserve9 = zzreserve9;
    }

    public String getZzreserve10() {
        return zzreserve10;
    }

    public void setZzreserve10(String zzreserve10) {
        this.zzreserve10 = zzreserve10;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCreationUserId() {
        return creationUserId;
    }

    public void setCreationUserId(String creationUserId) {
        this.creationUserId = creationUserId;
    }

    public LocalDateTime getCreationDttm() {
        return creationDttm;
    }

    public void setCreationDttm(LocalDateTime creationDttm) {
        this.creationDttm = creationDttm;
    }

    public String getUpdtdUserId() {
        return updtdUserId;
    }

    public void setUpdtdUserId(String updtdUserId) {
        this.updtdUserId = updtdUserId;
    }

    public LocalDateTime getUpdtdDttm() {
        return updtdDttm;
    }

    public void setUpdtdDttm(LocalDateTime updtdDttm) {
        this.updtdDttm = updtdDttm;
    }

    public String getZzflgBp() {
        return zzflgBp;
    }

    public void setZzflgBp(String zzflgBp) {
        this.zzflgBp = zzflgBp;
    }

    public String getZzflgCac() {
        return zzflgCac;
    }

    public void setZzflgCac(String zzflgCac) {
        this.zzflgCac = zzflgCac;
    }

    public String getZzinindD() {
        return zzinindD;
    }

    public void setZzinindD(String zzinindD) {
        this.zzinindD = zzinindD;
    }

    public String getZzinindN() {
        return zzinindN;
    }

    public void setZzinindN(String zzinindN) {
        this.zzinindN = zzinindN;
    }

    @Override
    public String toString() {
        return "AmsT0001{" +
        "zztimestamp = " + zztimestamp +
        ", zzline = " + zzline +
        ", zzprStep = " + zzprStep +
        ", zzmasterMod = " + zzmasterMod +
        ", zzoldkeyBp = " + zzoldkeyBp +
        ", zzoldkeyCac = " + zzoldkeyCac +
        ", zzoldkeyCa = " + zzoldkeyCa +
        ", zzoldkeyCo = " + zzoldkeyCo +
        ", zzoldkeyPr = " + zzoldkeyPr +
        ", zzoldkeyIn = " + zzoldkeyIn +
        ", zzoldkeyInf = " + zzoldkeyInf +
        ", zzoldkeyDv = " + zzoldkeyDv +
        ", zzoldkeyDvm = " + zzoldkeyDvm +
        ", zzoldkeyCt = " + zzoldkeyCt +
        ", zzoldkeyPf = " + zzoldkeyPf +
        ", zzoldkeyPa = " + zzoldkeyPa +
        ", zzflgInf = " + zzflgInf +
        ", zzflgDv = " + zzflgDv +
        ", zzflgDvm = " + zzflgDvm +
        ", zzflgPf = " + zzflgPf +
        ", zzflgPa = " + zzflgPa +
        ", zzdocNo = " + zzdocNo +
        ", zzpartnerH = " + zzpartnerH +
        ", zzabwvkH = " + zzabwvkH +
        ", zzzkeithuno = " + zzzkeithuno +
        ", zzbillPid = " + zzbillPid +
        ", zzpartner = " + zzpartner +
        ", zzabwvk = " + zzabwvk +
        ", zzvkont = " + zzvkont +
        ", vertrag = " + vertrag +
        ", anlage = " + anlage +
        ", vstelle = " + vstelle +
        ", haus = " + haus +
        ", zzbuSort1 = " + zzbuSort1 +
        ", zznameOrg1 = " + zznameOrg1 +
        ", zzpostCode1 = " + zzpostCode1 +
        ", zzstreetI = " + zzstreetI +
        ", zzstreet = " + zzstreet +
        ", zzbuilding = " + zzbuilding +
        ", zzstrSuppl2 = " + zzstrSuppl2 +
        ", zznameCo = " + zznameCo +
        ", zztelNoF1 = " + zztelNoF1 +
        ", zztelNoF2 = " + zztelNoF2 +
        ", zztelNoF3 = " + zztelNoF3 +
        ", zztelNoM1 = " + zztelNoM1 +
        ", zztelNoM2 = " + zztelNoM2 +
        ", zztelNoM3 = " + zztelNoM3 +
        ", zzadext = " + zzadext +
        ", zzbankl = " + zzbankl +
        ", zzbankn = " + zzbankn +
        ", zzbkont = " + zzbkont +
        ", zzkoinh = " + zzkoinh +
        ", zzccins = " + zzccins +
        ", zzccnum = " + zzccnum +
        ", zzzahlkond = " + zzzahlkond +
        ", zzflgccivprt = " + zzflgccivprt +
        ", zzsendctRh = " + zzsendctRh +
        ", zznoctrsnd = " + zznoctrsnd +
        ", zzflgnoprtbk = " + zzflgnoprtbk +
        ", zzcaknrKbn = " + zzcaknrKbn +
        ", zzezawe = " + zzezawe +
        ", zzvrefer = " + zzvrefer +
        ", zzcontclass = " + zzcontclass +
        ", zzcntstr = " + zzcntstr +
        ", zzcntend = " + zzcntend +
        ", zzbrnche = " + zzbrnche +
        ", zztarget = " + zztarget +
        ", zzbidflg = " + zzbidflg +
        ", zztariftyp = " + zztariftyp +
        ", zzkykymtd = " + zzkykymtd +
        ", zzableinh = " + zzableinh +
        ", zzcoPostcd1 = " + zzcoPostcd1 +
        ", zzcoStreet = " + zzcoStreet +
        ", zzextUi = " + zzextUi +
        ", zzdmMnCc = " + zzdmMnCc +
        ", zzdmMnCa = " + zzdmMnCa +
        ", zzdmMnLc = " + zzdmMnLc +
        ", zzfcMnHh = " + zzfcMnHh +
        ", zzfcWaWa = " + zzfcWaWa +
        ", zzfcMnOe = " + zzfcMnOe +
        ", zzfcMnIa = " + zzfcMnIa +
        ", zzfcSi01 = " + zzfcSi01 +
        ", zzrtOpBx = " + zzrtOpBx +
        ", zzdmCa9o = " + zzdmCa9o +
        ", zzdmCa9p = " + zzdmCa9p +
        ", zzdmCa9q = " + zzdmCa9q +
        ", zzdmCa9r = " + zzdmCa9r +
        ", zzdmCaNa = " + zzdmCaNa +
        ", zzdmCaNb = " + zzdmCaNb +
        ", zzfcRaLn = " + zzfcRaLn +
        ", zzfcRaMl = " + zzfcRaMl +
        ", zzfcMnRr = " + zzfcMnRr +
        ", zzqtDgD11 = " + zzqtDgD11 +
        ", zzdmMnCr = " + zzdmMnCr +
        ", zzfcEb11 = " + zzfcEb11 +
        ", zzfcEb12 = " + zzfcEb12 +
        ", zzfcEb13 = " + zzfcEb13 +
        ", zzfcEb14 = " + zzfcEb14 +
        ", zzfcEb15 = " + zzfcEb15 +
        ", zzfcEb21 = " + zzfcEb21 +
        ", zzfcEb22 = " + zzfcEb22 +
        ", zzfcEb23 = " + zzfcEb23 +
        ", zzfcEb24 = " + zzfcEb24 +
        ", zzfcEb25 = " + zzfcEb25 +
        ", zzfcEb01 = " + zzfcEb01 +
        ", zzfcEb02 = " + zzfcEb02 +
        ", zzfcEb03 = " + zzfcEb03 +
        ", zzfcEb04 = " + zzfcEb04 +
        ", zzfcEb05 = " + zzfcEb05 +
        ", zzfcEh11 = " + zzfcEh11 +
        ", zzfcEh12 = " + zzfcEh12 +
        ", zzfcEh13 = " + zzfcEh13 +
        ", zzfcEh14 = " + zzfcEh14 +
        ", zzfcEh21 = " + zzfcEh21 +
        ", zzfcEh22 = " + zzfcEh22 +
        ", zzfcEh23 = " + zzfcEh23 +
        ", zzfcEh24 = " + zzfcEh24 +
        ", zzfcEh01 = " + zzfcEh01 +
        ", zzfcEh02 = " + zzfcEh02 +
        ", zzqtRcRxa = " + zzqtRcRxa +
        ", zzfcMnOta = " + zzfcMnOta +
        ", zzqtRc1ra = " + zzqtRc1ra +
        ", zzqtRc2ra = " + zzqtRc2ra +
        ", zzqtRc3ra = " + zzqtRc3ra +
        ", zzqtRc4ra = " + zzqtRc4ra +
        ", zzqtRc5ra = " + zzqtRc5ra +
        ", zzqtRc6ra = " + zzqtRc6ra +
        ", zzqtRc7ra = " + zzqtRc7ra +
        ", zzqtRc8ra = " + zzqtRc8ra +
        ", zzqtTaTaar = " + zzqtTaTaar +
        ", zzqtTaTxar = " + zzqtTaTxar +
        ", zzqtTaXfar = " + zzqtTaXfar +
        ", zzqtEnTaar = " + zzqtEnTaar +
        ", zzudSi01F = " + zzudSi01F +
        ", zzudSi01T = " + zzudSi01T +
        ", zzdmMnUh = " + zzdmMnUh +
        ", zzrtOpB2 = " + zzrtOpB2 +
        ", zzrtOpB2F = " + zzrtOpB2F +
        ", zzrtOpB2T = " + zzrtOpB2T +
        ", zzetimeInd = " + zzetimeInd +
        ", zzzahlkondC = " + zzzahlkondC +
        ", zzprocStat = " + zzprocStat +
        ", zzreserve1 = " + zzreserve1 +
        ", zzreserve2 = " + zzreserve2 +
        ", zzreserve3 = " + zzreserve3 +
        ", zzreserve4 = " + zzreserve4 +
        ", zzreserve5 = " + zzreserve5 +
        ", zzreserve6 = " + zzreserve6 +
        ", zzreserve7 = " + zzreserve7 +
        ", zzreserve8 = " + zzreserve8 +
        ", zzreserve9 = " + zzreserve9 +
        ", zzreserve10 = " + zzreserve10 +
        ", version = " + version +
        ", creationUserId = " + creationUserId +
        ", creationDttm = " + creationDttm +
        ", updtdUserId = " + updtdUserId +
        ", updtdDttm = " + updtdDttm +
        ", zzflgBp = " + zzflgBp +
        ", zzflgCac = " + zzflgCac +
        ", zzinindD = " + zzinindD +
        ", zzinindN = " + zzinindN +
        "}";
    }
}
