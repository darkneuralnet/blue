.class public final LIK0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LsQ1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIK0;
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

.method public synthetic constructor <init>(LHK0;)V
    .locals 0

    invoke-direct {p0}, LIK0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;)LsQ1;
    .locals 2

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LIK0$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LIK0$b;-><init>(LlG2;LJK0;)V

    return-object v0
.end method
