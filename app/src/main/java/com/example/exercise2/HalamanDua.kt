package com.example.exercise2

import Data.OrderUIState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun HalamanDua (
    orderUIState: OrderUIState,
    onCancelButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    val items = listOf(
        Pair(stringResource(R.string.nama), orderUIState.nama),
        Pair(stringResource(R.string.nim), orderUIState.nim),
        Pair(stringResource(R.string.konsentrasi), orderUIState.konsentrasi),
        Pair(stringResource(R.string.judul), orderUIState.judul)
    )
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier =
            Modifier.padding(16.dp),
            verticalArrangement =
            Arrangement.spacedBy(16.dp)
        ) {
            items.forEach { item ->
                Column {
                    Text(item.first.uppercase())
                    Text(
                        text = item.second.toString(), fontWeight =
                        FontWeight.Bold
                    )
                }
                Divider(
                    thickness =
                    dimensionResource(androidx.core.R.dimen.compat_button_inset_vertical_material)
                )
            }

        }
    }
}



