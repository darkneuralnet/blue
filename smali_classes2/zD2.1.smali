.class public final synthetic LzD2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/lang/ref/WeakReference;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ref/WeakReference;Landroid/content/Context;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzD2;->b:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, LzD2;->c:Landroid/content/Context;

    iput p3, p0, LzD2;->d:I

    iput-object p4, p0, LzD2;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LzD2;->b:Ljava/lang/ref/WeakReference;

    iget-object v1, p0, LzD2;->c:Landroid/content/Context;

    iget v2, p0, LzD2;->d:I

    iget-object v3, p0, LzD2;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, LAD2;->c(Ljava/lang/ref/WeakReference;Landroid/content/Context;ILjava/lang/String;)LbE2;

    move-result-object v0

    return-object v0
.end method
