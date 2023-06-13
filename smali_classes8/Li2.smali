.class public final LLi2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKj2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LKj2<",
        "LKi2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c2\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "LLi2;",
        "LKj2;",
        "LKi2;",
        "Lrb1;",
        "encoder",
        "value",
        "",
        "b",
        "LGV0;",
        "decoder",
        "a",
        "LMs5;",
        "LMs5;",
        "getDescriptor",
        "()LMs5;",
        "descriptor",
        "<init>",
        "()V",
        "kotlinx-serialization-json"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nJsonElementSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElementSerializers.kt\nkotlinx/serialization/json/JsonLiteralSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,234:1\n1#2:235\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LLi2;

.field public static final b:LMs5;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LLi2;

    invoke-direct {v0}, LLi2;-><init>()V

    sput-object v0, LLi2;->a:LLi2;

    const-string v0, "kotlinx.serialization.json.JsonLiteral"

    sget-object v1, LE24$i;->a:LE24$i;

    invoke-static {v0, v1}, LQs5;->a(Ljava/lang/String;LE24;)LMs5;

    move-result-object v0

    sput-object v0, LLi2;->b:LMs5;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LGV0;)LKi2;
    .locals 2

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LCi2;->d(LGV0;)Lsi2;

    move-result-object p1

    invoke-interface {p1}, Lsi2;->v()Lxi2;

    move-result-object p1

    instance-of v0, p1, LKi2;

    if-eqz v0, :cond_0

    check-cast p1, LKi2;

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected JSON element, expected JsonLiteral, had "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, -0x1

    invoke-static {v1, v0, p1}, LFi2;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lkotlinx/serialization/json/internal/JsonDecodingException;

    move-result-object p1

    throw p1
.end method

.method public b(Lrb1;LKi2;)V
    .locals 2

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LCi2;->c(Lrb1;)V

    invoke-virtual {p2}, LKi2;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, LKi2;->a()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lrb1;->q(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p2}, LKi2;->b()LMs5;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, LKi2;->b()LMs5;

    move-result-object v0

    invoke-interface {p1, v0}, Lrb1;->u(LMs5;)Lrb1;

    move-result-object p1

    invoke-virtual {p2}, LKi2;->a()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lrb1;->q(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {p2}, Lzi2;->o(LYi2;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lrb1;->x(J)V

    return-void

    :cond_2
    invoke-virtual {p2}, LKi2;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/UStringsKt;->toULongOrNull(Ljava/lang/String;)Lkotlin/ULong;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lkotlin/ULong;->unbox-impl()J

    move-result-wide v0

    sget-object p2, Lkotlin/ULong;->Companion:Lkotlin/ULong$Companion;

    invoke-static {p2}, Lb40;->s(Lkotlin/ULong$Companion;)LKj2;

    move-result-object p2

    invoke-interface {p2}, LKj2;->getDescriptor()LMs5;

    move-result-object p2

    invoke-interface {p1, p2}, Lrb1;->u(LMs5;)Lrb1;

    move-result-object p1

    invoke-interface {p1, v0, v1}, Lrb1;->x(J)V

    return-void

    :cond_3
    invoke-static {p2}, Lzi2;->h(LYi2;)Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lrb1;->t(D)V

    return-void

    :cond_4
    invoke-static {p2}, Lzi2;->e(LYi2;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, p2}, Lrb1;->l(Z)V

    return-void

    :cond_5
    invoke-virtual {p2}, LKi2;->a()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lrb1;->q(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic deserialize(LGV0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LLi2;->a(LGV0;)LKi2;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LMs5;
    .locals 1

    sget-object v0, LLi2;->b:LMs5;

    return-object v0
.end method

.method public bridge synthetic serialize(Lrb1;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LKi2;

    invoke-virtual {p0, p1, p2}, LLi2;->b(Lrb1;LKi2;)V

    return-void
.end method
