.class public final LOM0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lml3$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LOM0;
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

.method public synthetic constructor <init>(LNM0;)V
    .locals 0

    invoke-direct {p0}, LOM0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;)Lml3;
    .locals 2

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LOM0$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LOM0$b;-><init>(LlG2;LPM0;)V

    return-object v0
.end method
