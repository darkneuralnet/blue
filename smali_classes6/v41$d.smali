.class public Lv41$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv41;-><init>(Ljava/lang/String;Lpd5;Lio/reactivex/Observable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/disposables/c;

.field public final synthetic c:Lv41;


# direct methods
.method public constructor <init>(Lv41;Lio/reactivex/disposables/c;)V
    .locals 0

    iput-object p1, p0, Lv41$d;->c:Lv41;

    iput-object p2, p0, Lv41$d;->b:Lio/reactivex/disposables/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lv41$d;->b:Lio/reactivex/disposables/c;

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    return-void
.end method
