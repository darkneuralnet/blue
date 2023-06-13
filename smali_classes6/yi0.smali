.class public final Lyi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lxi0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Landroid/content/ContentResolver;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Landroid/location/LocationManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Landroid/content/ContentResolver;",
            ">;",
            "LZ94<",
            "Landroid/location/LocationManager;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyi0;->a:LZ94;

    iput-object p2, p0, Lyi0;->b:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;)Lyi0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Landroid/content/ContentResolver;",
            ">;",
            "LZ94<",
            "Landroid/location/LocationManager;",
            ">;)",
            "Lyi0;"
        }
    .end annotation

    new-instance v0, Lyi0;

    invoke-direct {v0, p0, p1}, Lyi0;-><init>(LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Landroid/content/ContentResolver;Landroid/location/LocationManager;)Lxi0;
    .locals 1

    new-instance v0, Lxi0;

    invoke-direct {v0, p0, p1}, Lxi0;-><init>(Landroid/content/ContentResolver;Landroid/location/LocationManager;)V

    return-object v0
.end method


# virtual methods
.method public b()Lxi0;
    .locals 2

    iget-object v0, p0, Lyi0;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ContentResolver;

    iget-object v1, p0, Lyi0;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/LocationManager;

    invoke-static {v0, v1}, Lyi0;->c(Landroid/content/ContentResolver;Landroid/location/LocationManager;)Lxi0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lyi0;->b()Lxi0;

    move-result-object v0

    return-object v0
.end method
