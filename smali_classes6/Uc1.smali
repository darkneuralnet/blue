.class public final LUc1;
.super LE9;
.source "SourceFile"


# static fields
.field public static final f:LUc1;

.field public static final g:LUc1;

.field public static final h:LUc1;

.field public static final i:LUc1;

.field public static final j:LUc1;

.field public static final k:LUc1;

.field public static final l:LUc1;

.field public static final m:LUc1;

.field public static final n:LUc1;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final e:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, LUc1;

    sget-object v1, LrJ4;->b:LrJ4;

    const-string v2, "A128CBC-HS256"

    const/16 v3, 0x100

    invoke-direct {v0, v2, v1, v3}, LUc1;-><init>(Ljava/lang/String;LrJ4;I)V

    sput-object v0, LUc1;->f:LUc1;

    new-instance v0, LUc1;

    sget-object v2, LrJ4;->d:LrJ4;

    const/16 v4, 0x180

    const-string v5, "A192CBC-HS384"

    invoke-direct {v0, v5, v2, v4}, LUc1;-><init>(Ljava/lang/String;LrJ4;I)V

    sput-object v0, LUc1;->g:LUc1;

    new-instance v0, LUc1;

    const-string v4, "A256CBC-HS512"

    const/16 v5, 0x200

    invoke-direct {v0, v4, v1, v5}, LUc1;-><init>(Ljava/lang/String;LrJ4;I)V

    sput-object v0, LUc1;->h:LUc1;

    new-instance v0, LUc1;

    const-string v1, "A128CBC+HS256"

    invoke-direct {v0, v1, v2, v3}, LUc1;-><init>(Ljava/lang/String;LrJ4;I)V

    sput-object v0, LUc1;->i:LUc1;

    new-instance v0, LUc1;

    const-string v1, "A256CBC+HS512"

    invoke-direct {v0, v1, v2, v5}, LUc1;-><init>(Ljava/lang/String;LrJ4;I)V

    sput-object v0, LUc1;->j:LUc1;

    new-instance v0, LUc1;

    sget-object v1, LrJ4;->c:LrJ4;

    const/16 v4, 0x80

    const-string v5, "A128GCM"

    invoke-direct {v0, v5, v1, v4}, LUc1;-><init>(Ljava/lang/String;LrJ4;I)V

    sput-object v0, LUc1;->k:LUc1;

    new-instance v0, LUc1;

    const-string v4, "A192GCM"

    const/16 v5, 0xc0

    invoke-direct {v0, v4, v2, v5}, LUc1;-><init>(Ljava/lang/String;LrJ4;I)V

    sput-object v0, LUc1;->l:LUc1;

    new-instance v0, LUc1;

    const-string v4, "A256GCM"

    invoke-direct {v0, v4, v1, v3}, LUc1;-><init>(Ljava/lang/String;LrJ4;I)V

    sput-object v0, LUc1;->m:LUc1;

    new-instance v0, LUc1;

    const-string v1, "XC20P"

    invoke-direct {v0, v1, v2, v3}, LUc1;-><init>(Ljava/lang/String;LrJ4;I)V

    sput-object v0, LUc1;->n:LUc1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, LUc1;-><init>(Ljava/lang/String;LrJ4;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LrJ4;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, LE9;-><init>(Ljava/lang/String;LrJ4;)V

    iput p3, p0, LUc1;->e:I

    return-void
.end method

.method public static c(Ljava/lang/String;)LUc1;
    .locals 2

    sget-object v0, LUc1;->f:LUc1;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, LUc1;->g:LUc1;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, LUc1;->h:LUc1;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    sget-object v0, LUc1;->k:LUc1;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    return-object v0

    :cond_3
    sget-object v0, LUc1;->l:LUc1;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return-object v0

    :cond_4
    sget-object v0, LUc1;->m:LUc1;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    return-object v0

    :cond_5
    sget-object v0, LUc1;->i:LUc1;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    return-object v0

    :cond_6
    sget-object v0, LUc1;->j:LUc1;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    return-object v0

    :cond_7
    sget-object v0, LUc1;->n:LUc1;

    invoke-virtual {v0}, LE9;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    return-object v0

    :cond_8
    new-instance v0, LUc1;

    invoke-direct {v0, p0}, LUc1;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, LUc1;->e:I

    return v0
.end method
