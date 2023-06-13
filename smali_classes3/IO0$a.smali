.class public final LIO0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNy4$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIO0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LHO0;)V
    .locals 0

    invoke-direct {p0}, LIO0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;)LNy4;
    .locals 3

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LIO0$b;

    new-instance v1, LGy4;

    invoke-direct {v1}, LGy4;-><init>()V

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, LIO0$b;-><init>(LGy4;LlG2;LJO0;)V

    return-object v0
.end method
