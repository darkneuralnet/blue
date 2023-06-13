.class public final LLk9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LDR7;


# direct methods
.method public synthetic constructor <init>(LAk9;LGk9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LAk9;->a(LAk9;)LDR7;

    move-result-object p1

    iput-object p1, p0, LLk9;->a:LDR7;

    return-void
.end method


# virtual methods
.method public final a()LDR7;
    .locals 1
    .annotation build LD18;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LLk9;->a:LDR7;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LLk9;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LLk9;

    iget-object v0, p0, LLk9;->a:LDR7;

    iget-object p1, p1, LLk9;->a:LDR7;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, LLk9;->a:LDR7;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
