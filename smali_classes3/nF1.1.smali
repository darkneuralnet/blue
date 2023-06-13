.class public final synthetic LnF1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/util/Collection;

.field public final synthetic c:Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;

.field public final synthetic d:LpF1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Collection;Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;LpF1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LnF1;->b:Ljava/util/Collection;

    iput-object p2, p0, LnF1;->c:Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;

    iput-object p3, p0, LnF1;->d:LpF1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LnF1;->b:Ljava/util/Collection;

    iget-object v1, p0, LnF1;->c:Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;

    iget-object v2, p0, LnF1;->d:LpF1;

    invoke-static {v0, v1, v2}, LpF1;->c(Ljava/util/Collection;Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;LpF1;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
