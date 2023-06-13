.class public final Lcom/stripe/android/link/ui/ErrorTextStyle$Small;
.super Lcom/stripe/android/link/ui/ErrorTextStyle;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/ErrorTextStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Small"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u0008\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000c\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\t\u001a\u0004\u0008\r\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/ErrorTextStyle$Small;",
        "Lcom/stripe/android/link/ui/ErrorTextStyle;",
        "Lbc5;",
        "shape",
        "Lbc5;",
        "getShape",
        "()Lbc5;",
        "LgV2;",
        "iconModifier",
        "LgV2;",
        "getIconModifier",
        "()LgV2;",
        "textModifier",
        "getTextModifier",
        "LG26;",
        "textStyle",
        "LG26;",
        "getTextStyle",
        "()LG26;",
        "<init>",
        "()V",
        "link_release"
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
        "SMAP\nErrorText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorText.kt\ncom/stripe/android/link/ui/ErrorTextStyle$Small\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,95:1\n154#2:96\n154#2:97\n154#2:98\n154#2:99\n*S KotlinDebug\n*F\n+ 1 ErrorText.kt\ncom/stripe/android/link/ui/ErrorTextStyle$Small\n*L\n32#1:96\n34#1:97\n35#1:98\n37#1:99\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/link/ui/ErrorTextStyle$Small;

.field private static final iconModifier:LgV2;

.field private static final shape:Lbc5;

.field private static final textModifier:LgV2;

.field private static final textStyle:LG26;


# direct methods
.method public static constructor <clinit>()V
    .locals 36

    new-instance v0, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;-><init>()V

    sput-object v0, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->INSTANCE:Lcom/stripe/android/link/ui/ErrorTextStyle$Small;

    const/4 v0, 0x4

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v1

    invoke-static {v1}, Lcc5;->d(F)Lbc5;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->shape:Lbc5;

    sget-object v2, LgV2;->b0:LgV2$a;

    invoke-static {v0}, Lk61;->g(F)F

    move-result v1

    invoke-static {v2, v1}, LND3;->i(LgV2;F)LgV2;

    move-result-object v1

    const/16 v9, 0xc

    int-to-float v3, v9

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v1, v3}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->iconModifier:LgV2;

    const/4 v3, 0x0

    const/4 v1, 0x2

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v4

    invoke-static {v0}, Lk61;->g(F)F

    move-result v5

    invoke-static {v1}, Lk61;->g(F)F

    move-result v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->textModifier:LgV2;

    sget-object v0, Lkw1;->c:Lkw1$a;

    invoke-virtual {v0}, Lkw1$a;->a()LUX5;

    move-result-object v18

    sget-object v0, LJw1;->c:LJw1$a;

    invoke-virtual {v0}, LJw1$a;->e()LJw1;

    move-result-object v15

    invoke-static {v9}, LN26;->f(I)J

    move-result-wide v13

    const/16 v0, 0x10

    invoke-static {v0}, LN26;->f(I)J

    move-result-wide v31

    new-instance v0, LG26;

    move-object v10, v0

    const-wide/16 v11, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v33, 0x0

    const v34, 0x2ffd9

    const/16 v35, 0x0

    invoke-direct/range {v10 .. v35}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->textStyle:LG26;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/ErrorTextStyle;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public getIconModifier()LgV2;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->iconModifier:LgV2;

    return-object v0
.end method

.method public getShape()Lbc5;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->shape:Lbc5;

    return-object v0
.end method

.method public bridge synthetic getShape()Lhy5;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->getShape()Lbc5;

    move-result-object v0

    return-object v0
.end method

.method public getTextModifier()LgV2;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->textModifier:LgV2;

    return-object v0
.end method

.method public getTextStyle()LG26;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/ui/ErrorTextStyle$Small;->textStyle:LG26;

    return-object v0
.end method
