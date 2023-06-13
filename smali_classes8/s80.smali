.class public final synthetic Ls80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic a:Ljava/math/BigDecimal;

.field public final synthetic b:Ljava/math/BigDecimal;


# direct methods
.method public synthetic constructor <init>(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls80;->a:Ljava/math/BigDecimal;

    iput-object p2, p0, Ls80;->b:Ljava/math/BigDecimal;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ls80;->a:Ljava/math/BigDecimal;

    iget-object v1, p0, Ls80;->b:Ljava/math/BigDecimal;

    invoke-static {v0, v1}, Lt80$a;->a(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
