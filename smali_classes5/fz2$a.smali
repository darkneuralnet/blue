.class public Lfz2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfz2;->a(Landroid/content/Context;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/net/ConnectivityManager;

.field public final synthetic c:Lfz2;


# direct methods
.method public constructor <init>(Lfz2;Landroid/net/ConnectivityManager;)V
    .locals 0

    iput-object p1, p0, Lfz2$a;->c:Lfz2;

    iput-object p2, p0, Lfz2$a;->b:Landroid/net/ConnectivityManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lfz2$a;->c:Lfz2;

    iget-object v1, p0, Lfz2$a;->b:Landroid/net/ConnectivityManager;

    invoke-static {v0, v1}, Lfz2;->b(Lfz2;Landroid/net/ConnectivityManager;)V

    return-void
.end method
