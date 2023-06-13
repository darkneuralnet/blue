.class public final LCp3$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCp3;->s(LEp3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/OperatorOrderViewSection;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/OperatorOrderView;",
        ">;>;>;",
        "LpY3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u001e\u0010\u0004\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00000\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/OperatorOrderViewSection;",
        "Lco/bird/android/model/persistence/OperatorOrderView;",
        "orders",
        "LpY3;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)LpY3;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LCp3$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LCp3$b;

    invoke-direct {v0}, LCp3$b;-><init>()V

    sput-object v0, LCp3$b;->g:LCp3$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)LpY3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/OperatorOrderViewSection;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorOrderView;",
            ">;>;>;)",
            "LpY3;"
        }
    .end annotation

    const-string v0, "orders"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LpY3;

    invoke-direct {v0, p1}, LpY3;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LCp3$b;->a(Ljava/util/List;)LpY3;

    move-result-object p1

    return-object p1
.end method
