.class public final synthetic LvW4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LtW4;

.field public final synthetic c:Lco/bird/android/model/persistence/RidePassView;


# direct methods
.method public synthetic constructor <init>(LtW4;Lco/bird/android/model/persistence/RidePassView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvW4;->b:LtW4;

    iput-object p2, p0, LvW4;->c:Lco/bird/android/model/persistence/RidePassView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LvW4;->b:LtW4;

    iget-object v1, p0, LvW4;->c:Lco/bird/android/model/persistence/RidePassView;

    invoke-static {v0, v1}, LtW4$l;->a(LtW4;Lco/bird/android/model/persistence/RidePassView;)V

    return-void
.end method
