.class public LSC6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsx1;


# static fields
.field public static final d:Ljava/lang/String;


# instance fields
.field public final a:LmZ5;

.field public final b:LZw1;

.field public final c:LIG6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WMFgUpdater"

    invoke-static {v0}, LBx2;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LSC6;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;LZw1;LmZ5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LSC6;->b:LZw1;

    iput-object p3, p0, LSC6;->a:LmZ5;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->I()LIG6;

    move-result-object p1

    iput-object p1, p0, LSC6;->c:LIG6;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/util/UUID;LYw1;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/UUID;",
            "LYw1;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lew5;->t()Lew5;

    move-result-object v6

    iget-object v7, p0, LSC6;->a:LmZ5;

    new-instance v8, LSC6$a;

    move-object v0, v8

    move-object v1, p0

    move-object v2, v6

    move-object v3, p2

    move-object v4, p3

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, LSC6$a;-><init>(LSC6;Lew5;Ljava/util/UUID;LYw1;Landroid/content/Context;)V

    invoke-interface {v7, v8}, LmZ5;->a(Ljava/lang/Runnable;)V

    return-object v6
.end method
