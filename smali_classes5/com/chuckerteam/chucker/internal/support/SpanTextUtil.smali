.class public final Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$ChuckerForegroundColorSpan;,
        Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$a;,
        Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;,
        Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u00052\u00020\u0001:\u0003\u001f\n\u000bB\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0008*\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\u000b\u001a\u00020\u0006*\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J$\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0014\u0010\u0011\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J)\u0010\u0013\u001a\u0004\u0018\u00010\u0006*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0015\u00a8\u0006 "
    }
    d2 = {
        "Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;",
        "",
        "",
        "input",
        "Landroid/text/SpannableStringBuilder;",
        "f",
        "",
        "startIndex",
        "Lkotlin/Pair;",
        "Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;",
        "a",
        "b",
        "start",
        "end",
        "color",
        "d",
        "tokenIndex",
        "c",
        "lastTokenType",
        "e",
        "(Landroid/text/SpannableStringBuilder;ILcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;)Ljava/lang/Integer;",
        "I",
        "jsonKeyColor",
        "jsonValueColor",
        "jsonDigitsAndNullValueColor",
        "jsonSignElementsColor",
        "jsonBooleanColor",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "ChuckerForegroundColorSpan",
        "com.github.ChuckerTeam.Chucker.library"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final f:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$a;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->f:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, LGf4;->chucker_json_key_color:I

    invoke-static {p1, v0}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->a:I

    sget v0, LGf4;->chucker_json_value_color:I

    invoke-static {p1, v0}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->b:I

    sget v0, LGf4;->chucker_json_digit_and_null_value_color:I

    invoke-static {p1, v0}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->c:I

    sget v0, LGf4;->chucker_json_elements_color:I

    invoke-static {p1, v0}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->d:I

    sget v0, LGf4;->chucker_json_boolean_color:I

    invoke-static {p1, v0}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->e:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;I)Lkotlin/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "I)",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->c:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b$a;

    invoke-virtual {v0}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b$a;->a()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p1, v0, p2, v1}, Lkotlin/text/StringsKt;->findAnyOf(Ljava/lang/CharSequence;Ljava/util/Collection;IZ)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, -0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    if-nez p1, :cond_0

    sget-object p1, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->k:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    sget-object v1, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->f:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    invoke-virtual {v1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->c()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->g:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    invoke-virtual {v1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->c()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->h:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    invoke-virtual {v1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->c()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    sget-object v1, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->i:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    invoke-virtual {v1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->c()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    sget-object v1, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->e:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    invoke-virtual {v1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->c()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_0

    :cond_5
    sget-object v1, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->j:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    invoke-virtual {v1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->c()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1

    :cond_7
    sget-object p1, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;->k:Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/CharSequence;I)I
    .locals 8

    const/16 v1, 0x22

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p1

    move v2, p2

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result p2

    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge p2, v0, :cond_2

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x22

    if-ne v0, v1, :cond_1

    if-eqz p2, :cond_0

    add-int/lit8 v0, p2, -0x1

    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x5c

    if-eq v0, v1, :cond_1

    :cond_0
    return p2

    :cond_1
    const/16 v3, 0x22

    add-int/lit8 v4, p2, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result p2

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public final c(Landroid/text/SpannableStringBuilder;I)I
    .locals 3

    invoke-virtual {p1, p2}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    move-result v0

    const/16 v1, 0x74

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lkotlin/text/CharsKt;->equals(CCZ)Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v0, p2, 0x4

    goto :goto_0

    :cond_0
    add-int/lit8 v0, p2, 0x5

    :goto_0
    iget v1, p0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->e:I

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->d(Landroid/text/SpannableStringBuilder;III)Landroid/text/SpannableStringBuilder;

    return v0
.end method

.method public final d(Landroid/text/SpannableStringBuilder;III)Landroid/text/SpannableStringBuilder;
    .locals 1

    new-instance v0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$ChuckerForegroundColorSpan;

    invoke-direct {v0, p4}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$ChuckerForegroundColorSpan;-><init>(I)V

    const/16 p4, 0x12

    invoke-virtual {p1, v0, p2, p3, p4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    return-object p1
.end method

.method public final e(Landroid/text/SpannableStringBuilder;ILcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;)Ljava/lang/Integer;
    .locals 2

    const/4 v0, -0x1

    if-nez p3, :cond_0

    move p3, v0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$c;->$EnumSwitchMapping$0:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v1, p3

    :goto_0
    if-eq p3, v0, :cond_1

    const/4 v1, 0x5

    if-eq p3, v1, :cond_1

    const/4 v1, 0x7

    if-eq p3, v1, :cond_1

    const/4 v1, 0x2

    if-eq p3, v1, :cond_1

    const/4 v1, 0x3

    if-eq p3, v1, :cond_1

    iget p3, p0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->b:I

    goto :goto_1

    :cond_1
    iget p3, p0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->a:I

    :goto_1
    add-int/lit8 v1, p2, 0x1

    :try_start_0
    invoke-virtual {p0, p1, v1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->b(Ljava/lang/CharSequence;I)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    if-ge v0, p2, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, p1, p2, v1, p3}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->d(Landroid/text/SpannableStringBuilder;III)Landroid/text/SpannableStringBuilder;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 7

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvx1;->a:Lvx1;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvx1;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    iget v2, p0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->c:I

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v3, v1, v2}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->d(Landroid/text/SpannableStringBuilder;III)Landroid/text/SpannableStringBuilder;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v3, v2, :cond_1

    invoke-virtual {p0, p1, v3}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->a(Ljava/lang/CharSequence;I)Lkotlin/Pair;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;

    sget-object v5, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$c;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v5, v5, v6

    packed-switch v5, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    return-object v0

    :pswitch_1
    invoke-virtual {p0, v0, v4, v1}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->e(Landroid/text/SpannableStringBuilder;ILcom/chuckerteam/chucker/internal/support/SpanTextUtil$b;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    goto :goto_2

    :cond_0
    return-object v0

    :pswitch_2
    add-int/lit8 v1, v4, 0x1

    iget v3, p0, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->d:I

    invoke-virtual {p0, v0, v4, v1, v3}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->d(Landroid/text/SpannableStringBuilder;III)Landroid/text/SpannableStringBuilder;

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0, v0, v4}, Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;->c(Landroid/text/SpannableStringBuilder;I)I

    move-result v1

    :goto_1
    move v3, v1

    :goto_2
    move-object v1, v2

    goto :goto_0

    :cond_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
