.class final Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt$lambda-6$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "invoke",
        "(LEt0;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt$lambda-6$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt$lambda-6$1;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt$lambda-6$1;-><init>()V

    sput-object v0, Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt$lambda-6$1;->INSTANCE:Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt$lambda-6$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt$lambda-6$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 9

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.link.ui.ComposableSingletons$LinkAppBarKt.lambda-6.<anonymous> (LinkAppBar.kt:170)"

    const v2, 0x5f929bd4

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    new-instance p2, Lcom/stripe/android/link/ui/LinkAppBarState;

    sget v4, Lcom/stripe/android/link/R$drawable;->ic_link_back:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, "email@example.com"

    sget-object v8, Lcom/stripe/android/link/model/AccountStatus;->Verified:Lcom/stripe/android/link/model/AccountStatus;

    move-object v3, p2

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/link/ui/LinkAppBarState;-><init>(IZZLjava/lang/String;Lcom/stripe/android/link/model/AccountStatus;)V

    sget-object v4, Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt$lambda-6$1$1;->INSTANCE:Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt$lambda-6$1$1;

    sget-object v5, Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt$lambda-6$1$2;->INSTANCE:Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt$lambda-6$1$2;

    sget-object v6, Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt$lambda-6$1$3;->INSTANCE:Lcom/stripe/android/link/ui/ComposableSingletons$LinkAppBarKt$lambda-6$1$3;

    const/16 v8, 0xdb0

    move-object v7, p1

    invoke-static/range {v3 .. v8}, Lcom/stripe/android/link/ui/LinkAppBarKt;->LinkAppBar(Lcom/stripe/android/link/ui/LinkAppBarState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method