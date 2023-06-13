.class public abstract LCE2;
.super LmB;
.source "SourceFile"


# static fields
.field public static final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lhh2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v1, Lhh2;->e:Lhh2;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v1, Lhh2;->f:Lhh2;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v1, Lhh2;->g:Lhh2;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LCE2;->d:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>([BLjava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/util/Set<",
            "Lhh2;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/KeyLengthException;
        }
    .end annotation

    invoke-direct {p0, p2}, LmB;-><init>(Ljava/util/Set;)V

    array-length p2, p1

    const/16 v0, 0x20

    if-lt p2, v0, :cond_0

    iput-object p1, p0, LCE2;->c:[B

    return-void

    :cond_0
    new-instance p1, Lcom/nimbusds/jose/KeyLengthException;

    const-string p2, "The secret length must be at least 256 bits"

    invoke-direct {p1, p2}, Lcom/nimbusds/jose/KeyLengthException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static d(Lhh2;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;
        }
    .end annotation

    sget-object v0, Lhh2;->e:Lhh2;

    invoke-virtual {p0, v0}, LE9;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "HMACSHA256"

    return-object p0

    :cond_0
    sget-object v0, Lhh2;->f:Lhh2;

    invoke-virtual {p0, v0}, LE9;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "HMACSHA384"

    return-object p0

    :cond_1
    sget-object v0, Lhh2;->g:Lhh2;

    invoke-virtual {p0, v0}, LE9;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "HMACSHA512"

    return-object p0

    :cond_2
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    sget-object v1, LCE2;->d:Ljava/util/Set;

    invoke-static {p0, v1}, LJ9;->d(Lhh2;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/nimbusds/jose/JOSEException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public e()[B
    .locals 1

    iget-object v0, p0, LCE2;->c:[B

    return-object v0
.end method
