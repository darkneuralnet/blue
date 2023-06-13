.class public LoM2$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoM2;->a(Landroid/content/Context;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/net/ConnectivityManager;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:LoM2;


# direct methods
.method public constructor <init>(LoM2;Landroid/net/ConnectivityManager;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, LoM2$c;->d:LoM2;

    iput-object p2, p0, LoM2$c;->b:Landroid/net/ConnectivityManager;

    iput-object p3, p0, LoM2$c;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LoM2$c;->d:LoM2;

    iget-object v1, p0, LoM2$c;->b:Landroid/net/ConnectivityManager;

    invoke-virtual {v0, v1}, LoM2;->k(Landroid/net/ConnectivityManager;)V

    iget-object v0, p0, LoM2$c;->d:LoM2;

    iget-object v1, p0, LoM2$c;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, LoM2;->l(Landroid/content/Context;)V

    return-void
.end method
