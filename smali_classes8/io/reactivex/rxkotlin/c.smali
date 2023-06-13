.class public final Lio/reactivex/rxkotlin/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJJ\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00080\u0007\"\u0008\u0008\u0000\u0010\u0002*\u00020\u0001\"\u0008\u0008\u0001\u0010\u0003*\u00020\u00012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004H\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/reactivex/rxkotlin/c;",
        "",
        "T",
        "U",
        "Lio/reactivex/u;",
        "s1",
        "s2",
        "Lio/reactivex/p;",
        "Lkotlin/Pair;",
        "a",
        "<init>",
        "()V",
        "rxkotlin"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lio/reactivex/rxkotlin/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/reactivex/rxkotlin/c;

    invoke-direct {v0}, Lio/reactivex/rxkotlin/c;-><init>()V

    sput-object v0, Lio/reactivex/rxkotlin/c;->a:Lio/reactivex/rxkotlin/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/u;Lio/reactivex/u;)Lio/reactivex/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/u<",
            "TT;>;",
            "Lio/reactivex/u<",
            "TU;>;)",
            "Lio/reactivex/p<",
            "Lkotlin/Pair<",
            "TT;TU;>;>;"
        }
    .end annotation

    sget-object v0, Lio/reactivex/rxkotlin/c$a;->a:Lio/reactivex/rxkotlin/c$a;

    invoke-static {p1, p2, v0}, Lio/reactivex/p;->h0(Lio/reactivex/u;Lio/reactivex/u;Lio/reactivex/functions/c;)Lio/reactivex/p;

    move-result-object p1

    const-string p2, "Maybe.zip(s1, s2,\n      \u2026n { t, u -> Pair(t, u) })"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
