.class public final LSP0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUj5$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSP0;
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

.method public synthetic constructor <init>(LRP0;)V
    .locals 0

    invoke-direct {p0}, LSP0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;)LUj5;
    .locals 2

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LSP0$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LSP0$b;-><init>(LlG2;LTP0;)V

    return-object v0
.end method
