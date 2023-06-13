.class public final LUH0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkn0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUH0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LWH0;)V
    .locals 0

    invoke-direct {p0}, LUH0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;)Lkn0;
    .locals 3

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LUH0$a;

    new-instance v1, Lhn0;

    invoke-direct {v1}, Lhn0;-><init>()V

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, LUH0$a;-><init>(Lhn0;LlG2;LVH0;)V

    return-object v0
.end method
