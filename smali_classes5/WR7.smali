.class public final LWR7;
.super LFM7;
.source "SourceFile"


# instance fields
.field public final transient d:LoM7;

.field public final transient e:[Ljava/lang/Object;

.field public final transient f:I


# direct methods
.method public constructor <init>(LoM7;[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, LFM7;-><init>()V

    iput-object p1, p0, LWR7;->d:LoM7;

    iput-object p2, p0, LWR7;->e:[Ljava/lang/Object;

    iput p4, p0, LWR7;->f:I

    return-void
.end method

.method public static synthetic o(LWR7;)I
    .locals 0

    iget p0, p0, LWR7;->f:I

    return p0
.end method

.method public static synthetic s(LWR7;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LWR7;->e:[Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final a([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, LFM7;->h()LHL7;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, LBJ7;->a([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, LWR7;->d:LoM7;

    invoke-virtual {v2, v0}, LoM7;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final e()LST7;
    .locals 2

    invoke-virtual {p0}, LFM7;->h()LHL7;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LHL7;->u(I)LhU7;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, LFM7;->h()LHL7;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LHL7;->u(I)LhU7;

    move-result-object v0

    return-object v0
.end method

.method public final j()LHL7;
    .locals 1

    new-instance v0, LGR7;

    invoke-direct {v0, p0}, LGR7;-><init>(LWR7;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LWR7;->f:I

    return v0
.end method
