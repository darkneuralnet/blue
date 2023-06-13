.class public final synthetic Ly95;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lwu6;


# direct methods
.method public synthetic constructor <init>(Lwu6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly95;->b:Lwu6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ly95;->b:Lwu6;

    invoke-static {v0}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->j(Lwu6;)V

    return-void
.end method
