.class public final synthetic LtQ4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LvQ4;

.field public final synthetic c:Lcom/google/android/gms/maps/model/LatLngBounds;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(LvQ4;Lcom/google/android/gms/maps/model/LatLngBounds;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LtQ4;->b:LvQ4;

    iput-object p2, p0, LtQ4;->c:Lcom/google/android/gms/maps/model/LatLngBounds;

    iput p3, p0, LtQ4;->d:I

    iput p4, p0, LtQ4;->e:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LtQ4;->b:LvQ4;

    iget-object v1, p0, LtQ4;->c:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget v2, p0, LtQ4;->d:I

    iget v3, p0, LtQ4;->e:I

    invoke-static {v0, v1, v2, v3}, LvQ4;->Ql(LvQ4;Lcom/google/android/gms/maps/model/LatLngBounds;II)V

    return-void
.end method
