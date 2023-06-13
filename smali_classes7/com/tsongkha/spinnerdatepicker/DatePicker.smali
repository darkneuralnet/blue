.class public Lcom/tsongkha/spinnerdatepicker/DatePicker;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tsongkha/spinnerdatepicker/DatePicker$SavedState;
    }
.end annotation


# instance fields
.field public b:Landroid/widget/NumberPicker;

.field public c:Landroid/widget/NumberPicker;

.field public d:Landroid/widget/NumberPicker;

.field public e:Landroid/widget/EditText;

.field public f:[Ljava/lang/String;

.field public g:I

.field public h:Ljava/util/Calendar;

.field public i:Ljava/util/Calendar;

.field public j:Ljava/util/Calendar;

.field public k:Ljava/util/Calendar;

.field public l:Z

.field public m:Z


# virtual methods
.method public final a(Ljava/util/Calendar;Ljava/util/Locale;)Ljava/util/Calendar;
    .locals 2

    if-nez p1, :cond_0

    invoke-static {p2}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {p2}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    return-object p1
.end method

.method public b(Ljava/util/Locale;)V
    .locals 6

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->h:Ljava/util/Calendar;

    invoke-virtual {p0, v0, p1}, Lcom/tsongkha/spinnerdatepicker/DatePicker;->a(Ljava/util/Calendar;Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->h:Ljava/util/Calendar;

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->i:Ljava/util/Calendar;

    invoke-virtual {p0, v0, p1}, Lcom/tsongkha/spinnerdatepicker/DatePicker;->a(Ljava/util/Calendar;Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->i:Ljava/util/Calendar;

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->j:Ljava/util/Calendar;

    invoke-virtual {p0, v0, p1}, Lcom/tsongkha/spinnerdatepicker/DatePicker;->a(Ljava/util/Calendar;Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->j:Ljava/util/Calendar;

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    invoke-virtual {p0, v0, p1}, Lcom/tsongkha/spinnerdatepicker/DatePicker;->a(Ljava/util/Calendar;Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object p1

    iput-object p1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    iget-object p1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->h:Ljava/util/Calendar;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->getActualMaximum(I)I

    move-result p1

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iput p1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->g:I

    new-instance p1, Ljava/text/DateFormatSymbols;

    invoke-direct {p1}, Ljava/text/DateFormatSymbols;-><init>()V

    invoke-virtual {p1}, Ljava/text/DateFormatSymbols;->getShortMonths()[Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->f:[Ljava/lang/String;

    invoke-virtual {p0}, Lcom/tsongkha/spinnerdatepicker/DatePicker;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->g:I

    new-array p1, p1, [Ljava/lang/String;

    iput-object p1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->f:[Ljava/lang/String;

    const/4 p1, 0x0

    move v1, p1

    :goto_0
    iget v2, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->g:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->f:[Ljava/lang/String;

    new-array v3, v0, [Ljava/lang/Object;

    add-int/lit8 v4, v1, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, p1

    const-string v5, "%d"

    invoke-static {v5, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    move v1, v4

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 7

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->b:Landroid/widget/NumberPicker;

    iget-boolean v1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->m:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    iget-object v1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->i:Ljava/util/Calendar;

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x5

    const/4 v5, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->b:Landroid/widget/NumberPicker;

    iget-object v6, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    invoke-virtual {v6, v4}, Ljava/util/Calendar;->get(I)I

    move-result v6

    invoke-virtual {v0, v6}, Landroid/widget/NumberPicker;->setMinValue(I)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->b:Landroid/widget/NumberPicker;

    iget-object v6, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    invoke-virtual {v6, v4}, Ljava/util/Calendar;->getActualMaximum(I)I

    move-result v6

    invoke-virtual {v0, v6}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->b:Landroid/widget/NumberPicker;

    invoke-virtual {v0, v2}, Landroid/widget/NumberPicker;->setWrapSelectorWheel(Z)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c:Landroid/widget/NumberPicker;

    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c:Landroid/widget/NumberPicker;

    iget-object v1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setMinValue(I)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c:Landroid/widget/NumberPicker;

    iget-object v1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->getActualMaximum(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c:Landroid/widget/NumberPicker;

    invoke-virtual {v0, v2}, Landroid/widget/NumberPicker;->setWrapSelectorWheel(Z)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    iget-object v6, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->j:Ljava/util/Calendar;

    invoke-virtual {v0, v6}, Ljava/util/Calendar;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->b:Landroid/widget/NumberPicker;

    iget-object v6, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    invoke-virtual {v6, v4}, Ljava/util/Calendar;->getActualMinimum(I)I

    move-result v6

    invoke-virtual {v0, v6}, Landroid/widget/NumberPicker;->setMinValue(I)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->b:Landroid/widget/NumberPicker;

    iget-object v6, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    invoke-virtual {v6, v4}, Ljava/util/Calendar;->get(I)I

    move-result v6

    invoke-virtual {v0, v6}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->b:Landroid/widget/NumberPicker;

    invoke-virtual {v0, v2}, Landroid/widget/NumberPicker;->setWrapSelectorWheel(Z)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c:Landroid/widget/NumberPicker;

    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c:Landroid/widget/NumberPicker;

    iget-object v1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->getActualMinimum(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setMinValue(I)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c:Landroid/widget/NumberPicker;

    iget-object v1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c:Landroid/widget/NumberPicker;

    invoke-virtual {v0, v2}, Landroid/widget/NumberPicker;->setWrapSelectorWheel(Z)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->b:Landroid/widget/NumberPicker;

    invoke-virtual {v0, v5}, Landroid/widget/NumberPicker;->setMinValue(I)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->b:Landroid/widget/NumberPicker;

    iget-object v6, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    invoke-virtual {v6, v4}, Ljava/util/Calendar;->getActualMaximum(I)I

    move-result v6

    invoke-virtual {v0, v6}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->b:Landroid/widget/NumberPicker;

    invoke-virtual {v0, v5}, Landroid/widget/NumberPicker;->setWrapSelectorWheel(Z)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c:Landroid/widget/NumberPicker;

    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c:Landroid/widget/NumberPicker;

    invoke-virtual {v0, v2}, Landroid/widget/NumberPicker;->setMinValue(I)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c:Landroid/widget/NumberPicker;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c:Landroid/widget/NumberPicker;

    invoke-virtual {v0, v5}, Landroid/widget/NumberPicker;->setWrapSelectorWheel(Z)V

    :goto_1
    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->f:[Ljava/lang/String;

    iget-object v1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c:Landroid/widget/NumberPicker;

    invoke-virtual {v1}, Landroid/widget/NumberPicker;->getMinValue()I

    move-result v1

    iget-object v6, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c:Landroid/widget/NumberPicker;

    invoke-virtual {v6}, Landroid/widget/NumberPicker;->getMaxValue()I

    move-result v6

    add-int/2addr v6, v5

    invoke-static {v0, v1, v6}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c:Landroid/widget/NumberPicker;

    invoke-virtual {v1, v0}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->d:Landroid/widget/NumberPicker;

    iget-object v1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->i:Ljava/util/Calendar;

    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setMinValue(I)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->d:Landroid/widget/NumberPicker;

    iget-object v1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->j:Ljava/util/Calendar;

    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->d:Landroid/widget/NumberPicker;

    invoke-virtual {v0, v2}, Landroid/widget/NumberPicker;->setWrapSelectorWheel(Z)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->d:Landroid/widget/NumberPicker;

    iget-object v1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setValue(I)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c:Landroid/widget/NumberPicker;

    iget-object v1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setValue(I)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->b:Landroid/widget/NumberPicker;

    iget-object v1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    invoke-virtual {v1, v4}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setValue(I)V

    invoke-virtual {p0}, Lcom/tsongkha/spinnerdatepicker/DatePicker;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->e:Landroid/widget/EditText;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setRawInputType(I)V

    :cond_3
    return-void
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->f:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isDigit(C)Z

    move-result v0

    return v0
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    invoke-virtual {p0, p1}, Landroid/view/View;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const/4 p1, 0x1

    return p1
.end method

.method public isEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->l:Z

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    iget-object p1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {p0, p1}, Lcom/tsongkha/spinnerdatepicker/DatePicker;->b(Ljava/util/Locale;)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 3

    check-cast p1, Lcom/tsongkha/spinnerdatepicker/DatePicker$SavedState;

    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    iget-wide v1, p1, Lcom/tsongkha/spinnerdatepicker/DatePicker$SavedState;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->i:Ljava/util/Calendar;

    iget-wide v1, p1, Lcom/tsongkha/spinnerdatepicker/DatePicker$SavedState;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->j:Ljava/util/Calendar;

    iget-wide v1, p1, Lcom/tsongkha/spinnerdatepicker/DatePicker$SavedState;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    invoke-virtual {p0}, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c()V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 7

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    new-instance v6, Lcom/tsongkha/spinnerdatepicker/DatePicker$SavedState;

    iget-object v2, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->k:Ljava/util/Calendar;

    iget-object v3, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->i:Ljava/util/Calendar;

    iget-object v4, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->j:Ljava/util/Calendar;

    iget-boolean v5, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->m:Z

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/tsongkha/spinnerdatepicker/DatePicker$SavedState;-><init>(Landroid/os/Parcelable;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;Z)V

    return-object v6
.end method

.method public setEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->b:Landroid/widget/NumberPicker;

    invoke-virtual {v0, p1}, Landroid/widget/NumberPicker;->setEnabled(Z)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->c:Landroid/widget/NumberPicker;

    invoke-virtual {v0, p1}, Landroid/widget/NumberPicker;->setEnabled(Z)V

    iget-object v0, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->d:Landroid/widget/NumberPicker;

    invoke-virtual {v0, p1}, Landroid/widget/NumberPicker;->setEnabled(Z)V

    iput-boolean p1, p0, Lcom/tsongkha/spinnerdatepicker/DatePicker;->l:Z

    return-void
.end method
