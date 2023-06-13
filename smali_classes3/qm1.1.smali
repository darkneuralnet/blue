.class public final Lqm1;
.super LiN5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lqm1;",
        "LiN5;",
        "<init>",
        "()V",
        "sober_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lqm1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqm1;

    invoke-direct {v0}, Lqm1;-><init>()V

    sput-object v0, Lqm1;->a:Lqm1;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LiN5;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
