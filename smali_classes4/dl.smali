.class public final Ldl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LMI6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhj;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/persistence/zone/impl/ZoneDatabase;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhj;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Lco/bird/android/persistence/zone/impl/ZoneDatabase;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldl;->a:Lhj;

    iput-object p2, p0, Ldl;->b:LY94;

    return-void
.end method

.method public static a(Lhj;LY94;)Ldl;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Lco/bird/android/persistence/zone/impl/ZoneDatabase;",
            ">;)",
            "Ldl;"
        }
    .end annotation

    new-instance v0, Ldl;

    invoke-direct {v0, p0, p1}, Ldl;-><init>(Lhj;LY94;)V

    return-object v0
.end method

.method public static c(Lhj;Lco/bird/android/persistence/zone/impl/ZoneDatabase;)LMI6;
    .locals 0

    invoke-virtual {p0, p1}, Lhj;->Y0(Lco/bird/android/persistence/zone/impl/ZoneDatabase;)LMI6;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LMI6;

    return-object p0
.end method


# virtual methods
.method public b()LMI6;
    .locals 2

    iget-object v0, p0, Ldl;->a:Lhj;

    iget-object v1, p0, Ldl;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/persistence/zone/impl/ZoneDatabase;

    invoke-static {v0, v1}, Ldl;->c(Lhj;Lco/bird/android/persistence/zone/impl/ZoneDatabase;)LMI6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldl;->b()LMI6;

    move-result-object v0

    return-object v0
.end method
