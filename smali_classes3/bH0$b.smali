.class public final LbH0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LsP$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LbH0;
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

.method public synthetic constructor <init>(LcH0;)V
    .locals 0

    invoke-direct {p0}, LbH0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;)LsP;
    .locals 2

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LbH0$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LbH0$a;-><init>(LlG2;LaH0;)V

    return-object v0
.end method
