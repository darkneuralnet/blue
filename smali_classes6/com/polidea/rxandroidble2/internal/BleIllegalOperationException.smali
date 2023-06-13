.class public Lcom/polidea/rxandroidble2/internal/BleIllegalOperationException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final b:Ljava/util/UUID;

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/UUID;II)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/polidea/rxandroidble2/internal/BleIllegalOperationException;->b:Ljava/util/UUID;

    iput p3, p0, Lcom/polidea/rxandroidble2/internal/BleIllegalOperationException;->c:I

    iput p4, p0, Lcom/polidea/rxandroidble2/internal/BleIllegalOperationException;->d:I

    return-void
.end method
