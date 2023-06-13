.class public final Lgb6$a$s7;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb6$a;->a(Lco/bird/android/config/tweaks/dsl/Tweaks;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LzB1<",
        "Lco/bird/android/model/constant/PriceOnScannerKind;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LzB1;",
        "Lco/bird/android/model/constant/PriceOnScannerKind;",
        "",
        "a",
        "(LzB1;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lgb6$a$s7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgb6$a$s7;

    invoke-direct {v0}, Lgb6$a$s7;-><init>()V

    sput-object v0, Lgb6$a$s7;->g:Lgb6$a$s7;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LzB1;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LzB1<",
            "Lco/bird/android/model/constant/PriceOnScannerKind;",
            ">;)V"
        }
    .end annotation

    const-string v0, "$this$tweak"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "priceOnScannerKind"

    invoke-virtual {p1, v0}, LSa6;->g(Ljava/lang/String;)V

    const-class v0, Lco/bird/android/model/constant/PriceOnScannerKind;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/reflect/full/KClassifiers;->createType$default(Lkotlin/reflect/KClassifier;Ljava/util/List;ZLjava/util/List;ILjava/lang/Object;)Lkotlin/reflect/KType;

    move-result-object v0

    invoke-virtual {p1, v0}, LzB1;->i(Lkotlin/reflect/KType;)V

    sget-object v0, Lgb6$a$s7$a;->g:Lgb6$a$s7$a;

    invoke-virtual {p1, v0}, LSa6;->f(Lkotlin/jvm/functions/Function1;)V

    sget-object v0, Lgb6$a$s7$b;->g:Lgb6$a$s7$b;

    invoke-virtual {p1, v0}, LSa6;->e(Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LzB1;

    invoke-virtual {p0, p1}, Lgb6$a$s7;->a(LzB1;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
