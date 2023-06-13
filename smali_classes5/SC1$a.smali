.class public final LSC1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSC1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:LdR5;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LSC1$a;->a:LdR5;

    return-void
.end method


# virtual methods
.method public a()LSC1;
    .locals 2

    new-instance v0, LSC1;

    iget-object v1, p0, LSC1$a;->a:LdR5;

    invoke-direct {v0, v1}, LSC1;-><init>(LdR5;)V

    return-object v0
.end method

.method public b(LdR5;)LSC1$a;
    .locals 0

    iput-object p1, p0, LSC1$a;->a:LdR5;

    return-object p0
.end method
