.class public final Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u00028G\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R\u0011\u0010\t\u001a\u00020\u00068G\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;",
        "",
        "Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;",
        "getColors",
        "(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;",
        "colors",
        "Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;",
        "getTypography",
        "(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;",
        "typography",
        "<init>",
        "()V",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Theme.kt\ncom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,205:1\n76#2:206\n76#2:207\n*S KotlinDebug\n*F\n+ 1 Theme.kt\ncom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme\n*L\n178#1:206\n181#1:207\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;
    .locals 3
    .annotation build Lkotlin/jvm/JvmName;
        name = "getColors"
    .end annotation

    const v0, -0x7e9ca3db

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme.<get-colors> (Theme.kt:177)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->access$getLocalFinancialConnectionsColors$p()LU94;

    move-result-object p2

    invoke-interface {p1, p2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    return-object p2
.end method

.method public final getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;
    .locals 3
    .annotation build Lkotlin/jvm/JvmName;
        name = "getTypography"
    .end annotation

    const v0, 0x6254f466

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme.<get-typography> (Theme.kt:180)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->access$getLocalFinancialConnectionsTypography$p()LU94;

    move-result-object p2

    invoke-interface {p1, p2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    return-object p2
.end method
