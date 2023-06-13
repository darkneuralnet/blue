.class public final Lrm1;
.super LKa4;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lrm1;",
        "LKa4;",
        "<init>",
        "()V",
        "purchase-payment_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lrm1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrm1;

    invoke-direct {v0}, Lrm1;-><init>()V

    sput-object v0, Lrm1;->a:Lrm1;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LKa4;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
