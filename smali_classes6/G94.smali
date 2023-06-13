.class public final LG94;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lat5;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LQ70;

.field public final c:Lcom/google/crypto/tink/shaded/protobuf/g;

.field public final d:Lhk2$c;

.field public final e:LeA3;

.field public final f:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/g;Lhk2$c;LeA3;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG94;->a:Ljava/lang/String;

    invoke-static {p1}, Lsi6;->d(Ljava/lang/String;)LQ70;

    move-result-object p1

    iput-object p1, p0, LG94;->b:LQ70;

    iput-object p2, p0, LG94;->c:Lcom/google/crypto/tink/shaded/protobuf/g;

    iput-object p3, p0, LG94;->d:Lhk2$c;

    iput-object p4, p0, LG94;->e:LeA3;

    iput-object p5, p0, LG94;->f:Ljava/lang/Integer;

    return-void
.end method

.method public static b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/g;Lhk2$c;LeA3;Ljava/lang/Integer;)LG94;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    sget-object v0, LeA3;->f:LeA3;

    if-ne p3, v0, :cond_1

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Keys with output prefix type raw should not have an id requirement."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    if-eqz p4, :cond_2

    :goto_0
    new-instance v6, LG94;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LG94;-><init>(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/g;Lhk2$c;LeA3;Ljava/lang/Integer;)V

    return-object v6

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Keys with output prefix type different from raw should have an id requirement."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()LQ70;
    .locals 1

    iget-object v0, p0, LG94;->b:LQ70;

    return-object v0
.end method

.method public c()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, LG94;->f:Ljava/lang/Integer;

    return-object v0
.end method

.method public d()Lhk2$c;
    .locals 1

    iget-object v0, p0, LG94;->d:Lhk2$c;

    return-object v0
.end method

.method public e()LeA3;
    .locals 1

    iget-object v0, p0, LG94;->e:LeA3;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LG94;->a:Ljava/lang/String;

    return-object v0
.end method

.method public g()Lcom/google/crypto/tink/shaded/protobuf/g;
    .locals 1

    iget-object v0, p0, LG94;->c:Lcom/google/crypto/tink/shaded/protobuf/g;

    return-object v0
.end method
