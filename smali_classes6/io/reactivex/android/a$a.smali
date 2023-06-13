.class public Lio/reactivex/android/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/reactivex/android/a;->dispose()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/android/a;


# direct methods
.method public constructor <init>(Lio/reactivex/android/a;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/android/a$a;->b:Lio/reactivex/android/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/android/a$a;->b:Lio/reactivex/android/a;

    invoke-virtual {v0}, Lio/reactivex/android/a;->d()V

    return-void
.end method
