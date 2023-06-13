.class public final Lcom/google/android/libraries/places/internal/zzde;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:LoE1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LpE1;

    invoke-direct {v0}, LpE1;-><init>()V

    sget-object v1, LVk1;->f:LVk1;

    invoke-virtual {v0, v1}, LpE1;->i(LVk1;)LpE1;

    move-result-object v0

    invoke-virtual {v0}, LpE1;->b()LoE1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/libraries/places/internal/zzde;->zza:LoE1;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/libraries/places/internal/zzcc;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzde;->zza:LoE1;

    invoke-virtual {v0, p1, p2}, LoE1;->n(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    new-instance p1, Lcom/google/android/libraries/places/internal/zzcc;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x37

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Could not convert JSON string to "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " due to syntax errors."

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/google/android/libraries/places/internal/zzcc;-><init>(Ljava/lang/String;)V

    throw p1
.end method
