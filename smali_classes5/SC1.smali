.class public final LSC1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSC1$a;
    }
.end annotation


# static fields
.field public static final b:LSC1;


# instance fields
.field public final a:LdR5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LSC1$a;

    invoke-direct {v0}, LSC1$a;-><init>()V

    invoke-virtual {v0}, LSC1$a;->a()LSC1;

    move-result-object v0

    sput-object v0, LSC1;->b:LSC1;

    return-void
.end method

.method public constructor <init>(LdR5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSC1;->a:LdR5;

    return-void
.end method

.method public static b()LSC1$a;
    .locals 1

    new-instance v0, LSC1$a;

    invoke-direct {v0}, LSC1$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()LdR5;
    .locals 1
    .annotation build LK94;
        tag = 0x1
    .end annotation

    iget-object v0, p0, LSC1;->a:LdR5;

    return-object v0
.end method
