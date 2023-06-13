.class public final LpI0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPB0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LpI0;
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

.method public synthetic constructor <init>(LqI0;)V
    .locals 0

    invoke-direct {p0}, LpI0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;)LPB0;
    .locals 2

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LpI0$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LpI0$a;-><init>(LlG2;LoI0;)V

    return-object v0
.end method
