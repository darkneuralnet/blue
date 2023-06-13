.class public final Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\"\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\"\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0016\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0018"
    }
    d2 = {
        "Lkotlin/Function0;",
        "",
        "content",
        "FinancialConnectionsTheme",
        "(Lkotlin/jvm/functions/Function2;LEt0;I)V",
        "Lpm0;",
        "debugColor",
        "LMm0;",
        "debugColors-8_81llA",
        "(J)LMm0;",
        "debugColors",
        "Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;",
        "LightColorPalette",
        "Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;",
        "Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;",
        "Typography",
        "Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;",
        "LB26;",
        "TextSelectionColors",
        "LB26;",
        "LU94;",
        "LocalFinancialConnectionsTypography",
        "LU94;",
        "LocalFinancialConnectionsColors",
        "financial-connections_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final LightColorPalette:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

.field private static final LocalFinancialConnectionsColors:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;",
            ">;"
        }
    .end annotation
.end field

.field private static final LocalFinancialConnectionsTypography:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;",
            ">;"
        }
    .end annotation
.end field

.field private static final TextSelectionColors:LB26;

.field private static final Typography:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;


# direct methods
.method public static constructor <clinit>()V
    .locals 132

    new-instance v38, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-object/from16 v0, v38

    sget-object v27, Lpm0;->b:Lpm0$a;

    invoke-virtual/range {v27 .. v27}, Lpm0$a;->h()J

    move-result-wide v1

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ColorKt;->getNeutral50()J

    move-result-wide v3

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ColorKt;->getNeutral200()J

    move-result-wide v5

    const v7, 0x3f333333    # 0.7f

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xe

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ColorKt;->getNeutral150()J

    move-result-wide v7

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ColorKt;->getBlue400()J

    move-result-wide v9

    const v11, 0x3eb851ec    # 0.36f

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0xe

    const/16 v16, 0x0

    invoke-static/range {v9 .. v16}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v9

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ColorKt;->getRed500()J

    move-result-wide v11

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ColorKt;->getNeutral800()J

    move-result-wide v13

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ColorKt;->getNeutral500()J

    move-result-wide v15

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ColorKt;->getNeutral300()J

    move-result-wide v17

    invoke-virtual/range {v27 .. v27}, Lpm0$a;->h()J

    move-result-wide v19

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ColorKt;->getBrand500()J

    move-result-wide v21

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ColorKt;->getBlue500()J

    move-result-wide v23

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ColorKt;->getGreen500()J

    move-result-wide v25

    invoke-virtual/range {v27 .. v27}, Lpm0$a;->g()J

    move-result-wide v27

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ColorKt;->getRed500()J

    move-result-wide v29

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ColorKt;->getBrand400()J

    move-result-wide v31

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ColorKt;->getBlue400()J

    move-result-wide v33

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ColorKt;->getGreen400()J

    move-result-wide v35

    const/16 v37, 0x0

    invoke-direct/range {v0 .. v37}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;-><init>(JJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v38, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->LightColorPalette:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    new-instance v0, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-object/from16 v39, v0

    const/16 v1, 0x18

    invoke-static {v1}, LN26;->f(I)J

    move-result-wide v5

    const/16 v28, 0x20

    invoke-static/range {v28 .. v28}, LN26;->f(I)J

    move-result-wide v23

    sget-object v29, LJw1;->c:LJw1$a;

    invoke-virtual/range {v29 .. v29}, LJw1$a;->i()LJw1;

    move-result-object v7

    new-instance v2, LG26;

    move-object/from16 v40, v2

    const-wide/16 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const v26, 0x2fff9

    const/16 v27, 0x0

    invoke-direct/range {v2 .. v27}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, LN26;->f(I)J

    move-result-wide v45

    invoke-static/range {v28 .. v28}, LN26;->f(I)J

    move-result-wide v63

    invoke-virtual/range {v29 .. v29}, LJw1$a;->i()LJw1;

    move-result-object v47

    new-instance v42, LG26;

    move-object/from16 v41, v42

    const-wide/16 v43, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const-wide/16 v52, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const-wide/16 v57, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v65, 0x0

    const v66, 0x2fff9

    const/16 v67, 0x0

    invoke-direct/range {v42 .. v67}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v2, 0x12

    invoke-static {v2}, LN26;->f(I)J

    move-result-wide v6

    invoke-static {v1}, LN26;->f(I)J

    move-result-wide v24

    invoke-virtual/range {v29 .. v29}, LJw1$a;->i()LJw1;

    move-result-object v8

    new-instance v3, LG26;

    move-object/from16 v42, v3

    const-wide/16 v4, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    const v27, 0x2fff9

    const/16 v28, 0x0

    invoke-direct/range {v3 .. v28}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, LN26;->f(I)J

    move-result-wide v47

    invoke-static {v1}, LN26;->f(I)J

    move-result-wide v65

    invoke-virtual/range {v29 .. v29}, LJw1$a;->h()LJw1;

    move-result-object v49

    new-instance v44, LG26;

    move-object/from16 v43, v44

    const-wide/16 v45, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const-wide/16 v54, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const-wide/16 v59, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const v68, 0x2fff9

    const/16 v69, 0x0

    invoke-direct/range {v44 .. v69}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v3, 0xc

    invoke-static {v3}, LN26;->f(I)J

    move-result-wide v48

    const/16 v4, 0x14

    invoke-static {v4}, LN26;->f(I)J

    move-result-wide v66

    invoke-virtual/range {v29 .. v29}, LJw1$a;->h()LJw1;

    move-result-object v50

    new-instance v45, LG26;

    move-object/from16 v44, v45

    const-wide/16 v46, 0x0

    const/16 v54, 0x0

    const-wide/16 v55, 0x0

    const/16 v59, 0x0

    const-wide/16 v60, 0x0

    const/16 v65, 0x0

    const/16 v68, 0x0

    const v69, 0x2fff9

    const/16 v70, 0x0

    invoke-direct/range {v45 .. v70}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v5, 0x10

    invoke-static {v5}, LN26;->f(I)J

    move-result-wide v49

    invoke-static {v1}, LN26;->f(I)J

    move-result-wide v67

    invoke-virtual/range {v29 .. v29}, LJw1$a;->f()LJw1;

    move-result-object v51

    new-instance v46, LG26;

    move-object/from16 v45, v46

    const-wide/16 v47, 0x0

    const/16 v55, 0x0

    const-wide/16 v56, 0x0

    const/16 v60, 0x0

    const-wide/16 v61, 0x0

    const/16 v66, 0x0

    const/16 v69, 0x0

    const v70, 0x2fff9

    const/16 v71, 0x0

    invoke-direct/range {v46 .. v71}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v5}, LN26;->f(I)J

    move-result-wide v75

    invoke-static {v1}, LN26;->f(I)J

    move-result-wide v93

    invoke-virtual/range {v29 .. v29}, LJw1$a;->h()LJw1;

    move-result-object v77

    new-instance v72, LG26;

    move-object/from16 v46, v72

    const-wide/16 v73, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    const-wide/16 v82, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const-wide/16 v87, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const/16 v91, 0x0

    const/16 v92, 0x0

    const/16 v95, 0x0

    const v96, 0x2fff9

    const/16 v97, 0x0

    invoke-direct/range {v72 .. v97}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0xe

    invoke-static {v1}, LN26;->f(I)J

    move-result-wide v51

    invoke-static {v4}, LN26;->f(I)J

    move-result-wide v69

    invoke-virtual/range {v29 .. v29}, LJw1$a;->f()LJw1;

    move-result-object v53

    new-instance v48, LG26;

    move-object/from16 v47, v48

    const-wide/16 v49, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const-wide/16 v58, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const-wide/16 v63, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const v72, 0x2fff9

    const/16 v73, 0x0

    invoke-direct/range {v48 .. v73}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, LN26;->f(I)J

    move-result-wide v77

    invoke-static {v4}, LN26;->f(I)J

    move-result-wide v95

    invoke-virtual/range {v29 .. v29}, LJw1$a;->h()LJw1;

    move-result-object v79

    new-instance v74, LG26;

    move-object/from16 v48, v74

    const-wide/16 v75, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    const-wide/16 v84, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const-wide/16 v89, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const v98, 0x2fff9

    const/16 v99, 0x0

    invoke-direct/range {v74 .. v99}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, LN26;->f(I)J

    move-result-wide v103

    invoke-static {v2}, LN26;->f(I)J

    move-result-wide v121

    invoke-virtual/range {v29 .. v29}, LJw1$a;->f()LJw1;

    move-result-object v105

    new-instance v100, LG26;

    move-object/from16 v49, v100

    const-wide/16 v101, 0x0

    const/16 v106, 0x0

    const/16 v107, 0x0

    const/16 v108, 0x0

    const/16 v109, 0x0

    const-wide/16 v110, 0x0

    const/16 v112, 0x0

    const/16 v113, 0x0

    const/16 v114, 0x0

    const-wide/16 v115, 0x0

    const/16 v117, 0x0

    const/16 v118, 0x0

    const/16 v119, 0x0

    const/16 v120, 0x0

    const/16 v123, 0x0

    const v124, 0x2fff9

    const/16 v125, 0x0

    invoke-direct/range {v100 .. v125}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, LN26;->f(I)J

    move-result-wide v54

    invoke-static {v2}, LN26;->f(I)J

    move-result-wide v72

    invoke-virtual/range {v29 .. v29}, LJw1$a;->h()LJw1;

    move-result-object v56

    new-instance v51, LG26;

    move-object/from16 v50, v51

    const-wide/16 v52, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const-wide/16 v61, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const-wide/16 v66, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v74, 0x0

    const v75, 0x2fff9

    const/16 v76, 0x0

    invoke-direct/range {v51 .. v76}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, LN26;->f(I)J

    move-result-wide v80

    invoke-static {v5}, LN26;->f(I)J

    move-result-wide v98

    invoke-virtual/range {v29 .. v29}, LJw1$a;->f()LJw1;

    move-result-object v82

    new-instance v77, LG26;

    move-object/from16 v51, v77

    const-wide/16 v78, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    const-wide/16 v87, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const-wide/16 v92, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v100, 0x0

    const v101, 0x2fff9

    const/16 v102, 0x0

    invoke-direct/range {v77 .. v102}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, LN26;->f(I)J

    move-result-wide v106

    invoke-static {v5}, LN26;->f(I)J

    move-result-wide v124

    invoke-virtual/range {v29 .. v29}, LJw1$a;->h()LJw1;

    move-result-object v108

    new-instance v103, LG26;

    move-object/from16 v52, v103

    const-wide/16 v104, 0x0

    const/16 v110, 0x0

    const/16 v111, 0x0

    const-wide/16 v113, 0x0

    const/16 v115, 0x0

    const/16 v116, 0x0

    const-wide/16 v118, 0x0

    const/16 v121, 0x0

    const/16 v122, 0x0

    const/16 v126, 0x0

    const v127, 0x2fff9

    const/16 v128, 0x0

    invoke-direct/range {v103 .. v128}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, LN26;->f(I)J

    move-result-wide v57

    invoke-static {v4}, LN26;->f(I)J

    move-result-wide v75

    invoke-virtual/range {v29 .. v29}, LJw1$a;->f()LJw1;

    move-result-object v59

    new-instance v54, LG26;

    move-object/from16 v53, v54

    const-wide/16 v55, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const-wide/16 v64, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const-wide/16 v69, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v77, 0x0

    const v78, 0x2fff9

    const/16 v79, 0x0

    invoke-direct/range {v54 .. v79}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, LN26;->f(I)J

    move-result-wide v83

    invoke-static {v4}, LN26;->f(I)J

    move-result-wide v101

    invoke-virtual/range {v29 .. v29}, LJw1$a;->i()LJw1;

    move-result-object v85

    new-instance v80, LG26;

    move-object/from16 v54, v80

    const-wide/16 v81, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const-wide/16 v90, 0x0

    const/16 v92, 0x0

    const/16 v93, 0x0

    const-wide/16 v95, 0x0

    const/16 v98, 0x0

    const/16 v99, 0x0

    const/16 v103, 0x0

    const v104, 0x2fff9

    const/16 v105, 0x0

    invoke-direct/range {v80 .. v105}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, LN26;->f(I)J

    move-result-wide v109

    invoke-static {v5}, LN26;->f(I)J

    move-result-wide v127

    invoke-virtual/range {v29 .. v29}, LJw1$a;->f()LJw1;

    move-result-object v111

    new-instance v106, LG26;

    move-object/from16 v55, v106

    const-wide/16 v107, 0x0

    const/16 v113, 0x0

    const/16 v114, 0x0

    const-wide/16 v116, 0x0

    const/16 v118, 0x0

    const/16 v119, 0x0

    const-wide/16 v121, 0x0

    const/16 v124, 0x0

    const/16 v125, 0x0

    const/16 v129, 0x0

    const v130, 0x2fff9

    const/16 v131, 0x0

    invoke-direct/range {v106 .. v131}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, LN26;->f(I)J

    move-result-wide v60

    invoke-static {v5}, LN26;->f(I)J

    move-result-wide v78

    invoke-virtual/range {v29 .. v29}, LJw1$a;->i()LJw1;

    move-result-object v62

    new-instance v57, LG26;

    move-object/from16 v56, v57

    const-wide/16 v58, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const-wide/16 v67, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const-wide/16 v72, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v80, 0x0

    const v81, 0x2fff9

    const/16 v82, 0x0

    invoke-direct/range {v57 .. v82}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct/range {v39 .. v56}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;-><init>(LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;LG26;)V

    sput-object v0, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->Typography:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    new-instance v0, LB26;

    invoke-virtual/range {v38 .. v38}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextBrand-0d7_KjU()J

    move-result-wide v2

    invoke-virtual/range {v38 .. v38}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextBrand-0d7_KjU()J

    move-result-wide v4

    const v6, 0x3ecccccd    # 0.4f

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xe

    invoke-static/range {v4 .. v11}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LB26;-><init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->TextSelectionColors:LB26;

    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt$LocalFinancialConnectionsTypography$1;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/ThemeKt$LocalFinancialConnectionsTypography$1;

    invoke-static {v0}, Lgu0;->d(Lkotlin/jvm/functions/Function0;)LU94;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->LocalFinancialConnectionsTypography:LU94;

    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt$LocalFinancialConnectionsColors$1;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/ThemeKt$LocalFinancialConnectionsColors$1;

    invoke-static {v0}, Lgu0;->d(Lkotlin/jvm/functions/Function0;)LU94;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->LocalFinancialConnectionsColors:LU94;

    return-void
.end method

.method public static final FinancialConnectionsTheme(Lkotlin/jvm/functions/Function2;LEt0;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5a86b010

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v1, p2, 0xe

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0xb

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme (Theme.kt:147)"

    invoke-static {v0, v1, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    new-array v0, v2, [LW94;

    sget-object v2, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->LocalFinancialConnectionsTypography:LU94;

    sget-object v3, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->Typography:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    invoke-virtual {v2, v3}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    sget-object v2, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->LocalFinancialConnectionsColors:LU94;

    sget-object v3, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->LightColorPalette:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    invoke-virtual {v2, v3}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v0, v3

    new-instance v2, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt$FinancialConnectionsTheme$1;

    invoke-direct {v2, p0, v1}, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt$FinancialConnectionsTheme$1;-><init>(Lkotlin/jvm/functions/Function2;I)V

    const v1, -0x3f4ecb50

    invoke-static {p1, v1, v3, v2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p1, v2}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt$FinancialConnectionsTheme$2;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt$FinancialConnectionsTheme$2;-><init>(Lkotlin/jvm/functions/Function2;I)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void
.end method

.method public static final synthetic access$getLightColorPalette$p()Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->LightColorPalette:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    return-object v0
.end method

.method public static final synthetic access$getLocalFinancialConnectionsColors$p()LU94;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->LocalFinancialConnectionsColors:LU94;

    return-object v0
.end method

.method public static final synthetic access$getLocalFinancialConnectionsTypography$p()LU94;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->LocalFinancialConnectionsTypography:LU94;

    return-object v0
.end method

.method public static final synthetic access$getTextSelectionColors$p()LB26;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->TextSelectionColors:LB26;

    return-object v0
.end method

.method private static final debugColors-8_81llA(J)LMm0;
    .locals 28

    move-wide/from16 v1, p0

    move-wide/from16 v5, p0

    move-wide/from16 v13, p0

    move-wide/from16 v23, p0

    move-wide/from16 v21, p0

    move-wide/from16 v19, p0

    move-wide/from16 v17, p0

    move-wide/from16 v15, p0

    move-wide/from16 v7, p0

    move-wide/from16 v11, p0

    move-wide/from16 v9, p0

    move-wide/from16 v3, p0

    new-instance v27, LMm0;

    move-object/from16 v0, v27

    const/16 v25, 0x1

    const/16 v26, 0x0

    invoke-direct/range {v0 .. v26}, LMm0;-><init>(JJJJJJJJJJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v27
.end method

.method public static synthetic debugColors-8_81llA$default(JILjava/lang/Object;)LMm0;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p0, Lpm0;->b:Lpm0$a;

    invoke-virtual {p0}, Lpm0$a;->d()J

    move-result-wide p0

    :cond_0
    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->debugColors-8_81llA(J)LMm0;

    move-result-object p0

    return-object p0
.end method
