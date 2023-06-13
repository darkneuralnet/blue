.class public final LKm0$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKm0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LBm0;",
        "Lwb6<",
        "Lpm0;",
        "Luf;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LBm0;",
        "colorSpace",
        "Lwb6;",
        "Lpm0;",
        "Luf;",
        "a",
        "(LBm0;)Lwb6;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LKm0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LKm0$a;

    invoke-direct {v0}, LKm0$a;-><init>()V

    sput-object v0, LKm0$a;->g:LKm0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LBm0;)Lwb6;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBm0;",
            ")",
            "Lwb6<",
            "Lpm0;",
            "Luf;",
            ">;"
        }
    .end annotation

    const-string v0, "colorSpace"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LKm0$a$a;->g:LKm0$a$a;

    new-instance v1, LKm0$a$b;

    invoke-direct {v1, p1}, LKm0$a$b;-><init>(LBm0;)V

    invoke-static {v0, v1}, LXj6;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lwb6;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBm0;

    invoke-virtual {p0, p1}, LKm0$a;->a(LBm0;)Lwb6;

    move-result-object p1

    return-object p1
.end method
