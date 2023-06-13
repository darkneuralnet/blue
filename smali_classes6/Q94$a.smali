.class public final LQ94$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ94;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltb1<",
        "LQ94$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final d:LOd3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LOd3<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "LOd3<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "LHj6<",
            "*>;>;"
        }
    .end annotation
.end field

.field public c:LOd3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LOd3<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LP94;

    invoke-direct {v0}, LP94;-><init>()V

    sput-object v0, LQ94$a;->d:LOd3;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LQ94$a;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LQ94$a;->b:Ljava/util/Map;

    sget-object v0, LQ94$a;->d:LOd3;

    iput-object v0, p0, LQ94$a;->c:LOd3;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Object;LPd3;)V
    .locals 0

    invoke-static {p0, p1}, LQ94$a;->e(Ljava/lang/Object;LPd3;)V

    return-void
.end method

.method public static synthetic e(Ljava/lang/Object;LPd3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance p1, Lcom/google/firebase/encoders/EncodingException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t find encoder for type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/google/firebase/encoders/EncodingException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Class;LOd3;)Ltb1;
    .locals 0

    invoke-virtual {p0, p1, p2}, LQ94$a;->f(Ljava/lang/Class;LOd3;)LQ94$a;

    move-result-object p1

    return-object p1
.end method

.method public c()LQ94;
    .locals 4

    new-instance v0, LQ94;

    new-instance v1, Ljava/util/HashMap;

    iget-object v2, p0, LQ94$a;->a:Ljava/util/Map;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v2, Ljava/util/HashMap;

    iget-object v3, p0, LQ94$a;->b:Ljava/util/Map;

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iget-object v3, p0, LQ94$a;->c:LOd3;

    invoke-direct {v0, v1, v2, v3}, LQ94;-><init>(Ljava/util/Map;Ljava/util/Map;LOd3;)V

    return-object v0
.end method

.method public d(LFx0;)LQ94$a;
    .locals 0

    invoke-interface {p1, p0}, LFx0;->configure(Ltb1;)V

    return-object p0
.end method

.method public f(Ljava/lang/Class;LOd3;)LQ94$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TU;>;",
            "LOd3<",
            "-TU;>;)",
            "LQ94$a;"
        }
    .end annotation

    iget-object v0, p0, LQ94$a;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, LQ94$a;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
