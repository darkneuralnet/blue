.class public final LCh9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LK49;

.field public static volatile b:LK49;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhd9;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhd9;-><init>(Lh99;)V

    sput-object v0, LCh9;->a:LK49;

    sput-object v0, LCh9;->b:LK49;

    return-void
.end method

.method public static a()LK49;
    .locals 1

    sget-object v0, LCh9;->b:LK49;

    return-object v0
.end method
